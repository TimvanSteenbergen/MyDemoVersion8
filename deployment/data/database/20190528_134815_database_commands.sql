ALTER TABLE "system$image" ADD "submetaobjectname" VARCHAR_IGNORECASE(255) NULL;
UPDATE "system$image"
 SET "submetaobjectname" = 'System.Image';
CREATE INDEX "idx_system$image_submetaobjectname_asc" ON "system$image" ("submetaobjectname" ASC,"id" ASC);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('272f49fe-6a64-3ede-a32d-344a34e57b9f', 
'37827192-315d-4ab6-85b8-f626f866ea76', 
'submetaobjectname', 
'submetaobjectname', 
30, 
255, 
'System.Image', 
false);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('00a9ec1c-4fab-368f-83d4-ffa8ff501c8c', 
'37827192-315d-4ab6-85b8-f626f866ea76', 
'idx_system$image_submetaobjectname_asc');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('00a9ec1c-4fab-368f-83d4-ffa8ff501c8c', 
'272f49fe-6a64-3ede-a32d-344a34e57b9f', 
false, 
0);
CREATE TABLE "forumquestions$uploadedimage" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id")
 VALUES ('1f0db383-bb43-491c-8e78-d34b2e48f4ca', 
'ForumQuestions.UploadedImage', 
'forumquestions$uploadedimage', 
'37827192-315d-4ab6-85b8-f626f866ea76');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20190528 13:48:12';
