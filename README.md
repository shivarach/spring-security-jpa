# spring-security-jpa

## User data

  
create table user
(
	id int not null
		primary key,
	active bit not null,
	password varchar(255) null,
	roles varchar(255) null,
	user_name varchar(255) null
);


insert into user values(1, true, 'password', 'ROLE_USER', 'user');
insert into user values(1, true, 'password', 'ROLE_ADMIN,ROLE_USER', 'admin');
