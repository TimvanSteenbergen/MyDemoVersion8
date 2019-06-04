ALTER TABLE "forumquestions$workoutmaster" ADD "system$owner" BIGINT NULL;
CREATE INDEX "idx_forumquestions$workoutmaster_system$owner" ON "forumquestions$workoutmaster" ("system$owner" ASC,"id" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('0aad217f-ad1d-3d75-afe8-70ad76b167ae', 
'System.owner', 
'system$owner', 
'f59cd508-a6e0-4728-978a-fd16797eb2ad', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$owner');
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('84630147-c980-39af-9091-dd65ecc95409', 
'f59cd508-a6e0-4728-978a-fd16797eb2ad', 
'idx_forumquestions$workoutmaster_system$owner');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('84630147-c980-39af-9091-dd65ecc95409', 
'0aad217f-ad1d-3d75-afe8-70ad76b167ae', 
false, 
0);
ALTER TABLE "forumquestions$workouttracker" ALTER COLUMN "actibityvalue" RENAME TO "actviityvalue";
ALTER TABLE "forumquestions$workouttracker" ADD "system$owner" BIGINT NULL;
CREATE INDEX "idx_forumquestions$workouttracker_system$owner" ON "forumquestions$workouttracker" ("system$owner" ASC,"id" ASC);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'e9a277b0-33dd-4b4a-9f19-374831204076', 
"attribute_name" = 'ActviityValue', 
"column_name" = 'actviityvalue', 
"type" = 3, 
"length" = 0, 
"default_value" = '0', 
"is_auto_number" = false
 WHERE "id" = 'f34feb59-ecc3-48e6-bdfa-a52f9c255508';
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name")
 VALUES ('bd9c8bd6-a94e-34a3-b09e-42463e54ea06', 
'System.owner', 
'system$owner', 
'e9a277b0-33dd-4b4a-9f19-374831204076', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'id', 
'system$owner');
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('b0452cee-f55a-3163-88d5-41aa4dc9fadc', 
'e9a277b0-33dd-4b4a-9f19-374831204076', 
'idx_forumquestions$workouttracker_system$owner');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('b0452cee-f55a-3163-88d5-41aa4dc9fadc', 
'bd9c8bd6-a94e-34a3-b09e-42463e54ea06', 
false, 
0);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20190601 11:54:37';
