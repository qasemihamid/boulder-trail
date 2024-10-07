START TRANSACTION;

CREATE TEMPORARY TABLE temp_initial_version (initial_version VARCHAR(255));

INSERT INTO temp_initial_version (initial_version)
SELECT version FROM database_version_history ORDER BY database_version_history_id DESC FETCH FIRST ROW ONLY;
	
DO
'
DECLARE
    new_version text := ''1.0.1'';
BEGIN
    IF NOT EXISTS (SELECT 1 FROM database_version_history WHERE version = new_version) THEN
    
    	ALTER TABLE trail ADD test_column INTEGER;
        
        INSERT INTO database_version_history (version) VALUES (new_version);
    END IF;
END;
'
LANGUAGE PLPGSQL;

DROP TABLE temp_initial_version;

COMMIT;