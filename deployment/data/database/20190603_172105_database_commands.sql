CREATE TABLE "forumquestions$project" (
	"id" BIGINT NOT NULL,
	"name" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('860dd105-57a6-42a9-8b9c-c1c7a3e62f76', 
'ForumQuestions.Project', 
'forumquestions$project');
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('c49866cb-940b-41c9-a637-dcb21cf2a953', 
'860dd105-57a6-42a9-8b9c-c1c7a3e62f76', 
'Name', 
'name', 
30, 
200, 
'', 
false);
CREATE TABLE "forumquestions$bulletinboard" (
	"id" BIGINT NOT NULL,
	"description" VARCHAR_IGNORECASE(200) NULL,
	"title" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('c77077dc-0904-4885-9699-97157282c5ca', 
'ForumQuestions.Bulletinboard', 
'forumquestions$bulletinboard');
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('baf431b2-2c6d-4e5e-9765-4ea8b1e8d434', 
'c77077dc-0904-4885-9699-97157282c5ca', 
'Description', 
'description', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('6e57c555-9527-4d49-b407-dc5acc1e531e', 
'c77077dc-0904-4885-9699-97157282c5ca', 
'Title', 
'title', 
30, 
200, 
'', 
false);
CREATE TABLE "forumquestions$member" (
	"id" BIGINT NOT NULL,
	"name" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('ceac3942-13f1-4b72-bec8-926046d8f261', 
'ForumQuestions.Member', 
'forumquestions$member');
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('41c8c37f-0e4e-419f-84f8-2327d7090541', 
'ceac3942-13f1-4b72-bec8-926046d8f261', 
'Name', 
'name', 
30, 
200, 
'', 
false);
CREATE TABLE "forumquestions$member_project" (
	"forumquestions$memberid" BIGINT NOT NULL,
	"forumquestions$projectid" BIGINT NOT NULL,
	PRIMARY KEY("forumquestions$memberid","forumquestions$projectid"),
	CONSTRAINT "uniq_forumquestions$member_project_forumquestions$memberid" UNIQUE ("forumquestions$memberid"));
CREATE INDEX "idx_forumquestions$member_project_forumquestions$project_forumquestions$member" ON "forumquestions$member_project" ("forumquestions$projectid" ASC,"forumquestions$memberid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('d2c18353-8bb8-47b4-a2ac-5b9bdda1839e', 
'ForumQuestions.Member_Project', 
'forumquestions$member_project', 
'ceac3942-13f1-4b72-bec8-926046d8f261', 
'860dd105-57a6-42a9-8b9c-c1c7a3e62f76', 
'forumquestions$memberid', 
'forumquestions$projectid', 
'idx_forumquestions$member_project_forumquestions$project_forumquestions$member');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_forumquestions$member_project_forumquestions$memberid', 
'd2c18353-8bb8-47b4-a2ac-5b9bdda1839e', 
'6d0075aa-001b-33bf-9580-b54674fff9e6');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20190603 17:21:03';
