CREATE TABLE "forumquestions$testobject" (
	"id" BIGINT NOT NULL,
	"name" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('44fe4a53-0f1d-4ed5-ac66-09bd0fdd5fb5', 
'ForumQuestions.TestObject', 
'forumquestions$testobject');
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('c817fb36-ea7c-476c-b4bf-ac9738b552a5', 
'44fe4a53-0f1d-4ed5-ac66-09bd0fdd5fb5', 
'Name', 
'name', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20190529 16:06:43';
