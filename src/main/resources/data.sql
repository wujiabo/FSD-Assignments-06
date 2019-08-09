INSERT INTO sys_role (id, nameZh, name) VALUES (1,'管理员','ROLE_ADMIN');
INSERT INTO sys_role (id, nameZh, name) VALUES (2,'用户','ROLE_USER');

INSERT INTO sys_user (id, name, nickname, password) VALUES (1,'admin','管理员账号','123456');
INSERT INTO sys_user (id, name, nickname, password) VALUES (2,'les123','用户账号','123456');

INSERT INTO sys_user_role (id, user_id, role_id) VALUES (1,1,1);
INSERT INTO sys_user_role (id, user_id, role_id) VALUES (2,2,2);
