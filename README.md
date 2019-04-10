AmritaSite
==========

Technologies:
1. Spring Boot
2. Flyway
3. Angular


Lesson learned:

1. H2 console (http://localhost:8080/h2) did not load when the application is run from IntelliJ. 
It loaded when it was started from the commendline ```./gradle boonRun```

2. When anything was changed in the flyway SQL script (V2__create_food_allergy.sql), the build failed with error: 
       ```org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'flywayInitializer' 
defined in class path resource [org/springframework/boot/autoconfigure/flyway/FlywayAutoConfiguration$FlywayConfiguration.class]: 
Invocation of init method failed; nested exception is org.flywaydb.core.api.FlywayException: 
Validate failed: Migration checksum mismatch for migration version 2```

As a work around, moved the script file (V2__create_food_allergy.sql) to a different folder (e.g. public) 
from db/migration/. Then the build was successful. Then started the application and opened the h2 console. Went to flyway_schema_history 
table and deleted the row for this script. After that that moved the script back to db/migration. Then the build was successful. 