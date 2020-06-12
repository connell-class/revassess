
SELECT u.username, ss.name, c.name, f.question, f.answer FROM app_user u JOIN study_set ss ON u.user_id = ss.owner_id JOIN study_set_card USING (study_set_id) JOIN flashcard f USING (flashcard_id) JOIN category 
 c USING (category_id) WHERE u.user_id = (  SELECT owner_id FROM study_set WHERE study_set_id = 4);

