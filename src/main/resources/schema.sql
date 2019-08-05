CREATE TABLE sys_user (
  id int(11) NOT NULL,
  name varchar(11) NOT NULL,
  nickname varchar(11) NOT NULL,
  password varchar(64) NOT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE sys_role (
  id int(11) NOT NULL,
  nameZh varchar(11) NOT NULL,
  name varchar(11),
  PRIMARY KEY (id)
);
CREATE TABLE sys_user_role (
  id int(11) NOT NULL,
  user_id int(11),
  role_id int(11),
  PRIMARY KEY (id)
);
