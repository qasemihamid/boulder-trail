$(function() {
	
	//declaring datatable
	var trailTable = $("#trail-table").DataTable({
		order: [0, 'asc'],
		scrollX: true,
		scrollCollapse: true,
		lengthChange: true,
		colReorder: true,
		responsive: false,
		retrieve: true,
		processing: true,
		paging: true,
		serverSide: false,
		dom: '<"toolbar">Brltip',
		ajax: {
			url: "/getAllTrails",
			type: "POST",
			dataSrc: '',
	        contentType: "application/json",
			data: function(data) {
				return JSON.stringify({
					
					//data coming from filter fields
               		address: $("#address").val().trim(),
               		accessName: $("#access-name").val().trim(),
               		trailClassId: $("#trail-class").val() != "" ? parseInt($("#trail-class").val()) : null,
               		adaTrailDifficultyId: $("#ada-trail-diff").val() != "" ? parseInt($("#ada-trail-diff").val()) : null,
               		hasRestroom: $("#restroom").is(":checked"),
               		hasPicnic: $("#picnic").is(":checked"),
               		hasFishing: $("#fishing").is(":checked")
	           });		
			}
		},
		columns: [
			{
				data: 'accessName',
			}, {
				data: 'accessId',
			}, {
				data: 'accessType',
			}, {
				data: 'address',
			}, {
				data: 'aka',
			}, {
				data: 'dateFrom',
			}, {
				data: 'dateTo',
			}, {
				data: 'restroom',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'picnic',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'fishing',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'fee',
				render: function(data) {
					return data ? "Not Free" : "Free";
				}
			}, {
				data: 'bikeRack',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'grills',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'horseTrail',
			}, {
				data: 'recycleBin',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'dogCompost',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'thLeash',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'dogTube',
			}, {
				data: 'trashCans',
			}, {
				data: 'parkingSpace',
			}, {
				data: 'adaSurface',
			}, {
				data: 'adaFacility',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'adaFacilityName',
			}, {
				data: 'adaParking',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'adaParkingNo',
			}, {
				data: 'adaToilet',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'adaFishing',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'adaCamping',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: 'adaPicnic',
				render: function(data) {
					return data ? "Available" : "Not Available";
				}
			}, {
				data: null,
				render: function(data, type, row, meta) {
					return row.trailClassCode + " (" + row.trailClassName + ")"
				}
			}, {
				data: 'trailDifficulty',
			}
		],
	});
	
	//event listener for Apply Filter button
	$("#apply-filter").on("click", function(){
		trailTable.ajax.reload()
	})
	
});