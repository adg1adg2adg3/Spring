# 本章节简单说明了SPring的注入(setter注入)，源代码bug略多
```mysql
CREATE TABLE t_user(
	user_id INT AUTO_INCREMENT PRIMARY KEY,
	user_name VARCHAR(30),
	credits INT,
	PASSWORD VARCHAR(32),
	last_visit DATETIME,
	last_ip VARCHAR(23)
);

CREATE TABLE t_login_log(
	login_log_id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT,
	ip VARCHAR(23),
	login_datetime DATETIME
);
```
