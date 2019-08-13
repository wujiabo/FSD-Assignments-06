CREATE TABLE sys_user (
  id int(11) NOT NULL auto_increment,
  name varchar(11) NOT NULL,
  password varchar(64) NOT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE sys_role (
  id int(11) NOT NULL auto_increment,
  nameZh varchar(11) NOT NULL,
  name varchar(11),
  PRIMARY KEY (id)
);
CREATE TABLE sys_user_role (
  id int(11) NOT NULL auto_increment,
  user_id int(11),
  role_id int(11),
  PRIMARY KEY (id)
);
CREATE TABLE sys_captcha (
  captcha_key varchar(64) NOT NULL,
  captcha_value varchar(64),
  PRIMARY KEY (captcha_key)
);