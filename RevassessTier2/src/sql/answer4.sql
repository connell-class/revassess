SELECT u.username, ss.name AS set_name, c.name AS category_name, f.question, f.answer
 FROM testing.app_user u
 JOIN testing.study_set ss
 ON u.user_id = ss.owner_id
 JOIN testing.study_set_card 
 USING (study_set_id)
 JOIN testing.flashcard f
 USING (flashcard_id)
 JOIN testing.category c
 USING (category_id)
 WHERE u.user_id = (
 	SELECT owner_id
 	FROM testing.study_set
 	WHERE study_set_id = 4
);