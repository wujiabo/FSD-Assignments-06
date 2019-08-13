INSERT INTO sys_role (id, nameZh, name) VALUES (1,'管理员','ROLE_ADMIN');
INSERT INTO sys_role (id, nameZh, name) VALUES (2,'用户','ROLE_USER');

INSERT INTO sys_user (id, name, password) VALUES (1,'admin','$2a$10$eplVOAoCkTPfgciGlDKdHOyt4pE9w3S81wcguDHyHB0VZ9.YXUA3m');
INSERT INTO sys_user (id, name, password) VALUES (2,'test','$2a$10$eplVOAoCkTPfgciGlDKdHOyt4pE9w3S81wcguDHyHB0VZ9.YXUA3m');

INSERT INTO sys_user_role (id, user_id, role_id) VALUES (1,1,1);
INSERT INTO sys_user_role (id, user_id, role_id) VALUES (2,2,2);
