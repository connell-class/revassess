SELECT u.user_id, u.username, u.password, u.first_name, u.last_name, u.role_id, ss.study_set_id, ss.name
 FROM testing.app_user u
 JOIN testing.study_set ss
 ON u.user_id = ss.owner_id
 WHERE u.user_id = 5;