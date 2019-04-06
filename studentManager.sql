drop table Student;
drop table Course;
drop table Teacher;
drop table Userd;
drop table SC;
drop table TC;

create table Userd(
UserId varchar2(7) PRIMARY KEY,
passwordr varchar2(20) not null,
Utype varchar2(10) not null
);

create table Student(
Sno VARCHAR2(7) PRIMARY KEY,
Sname VARCHAR2(18) not null,
Ssex CHAR(3),
Sage SMALLINT,
Sdept VARCHAR2(30),
SPicture BLOB,
photo_url varchar2(200)
);

CREATE TABLE Course(
Cno VARCHAR2(4) PRIMARY KEY,
Cname VARCHAR2(50),
Ccredit NUMBER(2,0)--学分
);

Create Table Teacher(
TNO VARCHAR2(7) PRIMARY KEY,
Tname VARCHAR2(18) not null,
TSex CHAR(3),
Tpost varchar2(10),--职称
Tdept VARCHAR2(30)
);

create table SC(
Sno VARCHAR2(7),
Cno VARCHAR2(4),
Grade NUMBER(3,0),
PRIMARY KEY(Sno,Cno),
FOREIGN KEY (Sno) REFERENCES Student(Sno),
FOREIGN KEY (Cno) REFERENCES Course(Cno)
);

create table TC(
Tno VARCHAR2(7),
Cno VARCHAR2(4),
Classroom Varchar2(4),
PRIMARY KEY(Tno,Cno),
FOREIGN KEY (Tno) REFERENCES Teacher(Tno),
FOREIGN KEY (Cno) REFERENCES Course(Cno)
);

insert into userd values('1512101','chen1997','1');
insert into userd values('1512102','chen19970415','1');
insert into userd values('9512101','chen','2');
insert into userd values('9512102','chen199','2');
insert into userd values('9512104','19970415','2');

insert into student(sno,sname,ssex,sage,sdept,photo_url) values('9512101','李勇','男',19,'计算机系','nopic.jpg');
insert into student(sno,sname,ssex,sage,sdept,photo_url) values('9512102','刘晨','男',20,'计算机系','nopic.jpg');
insert into student(sno,sname,ssex,sage,sdept,photo_url) values('9512103','王敏','女',20,'计算机系','nopic.jpg');
insert into student(sno,sname,ssex,sage,sdept,photo_url) values('9521101','张立','男',22,'信息系','nopic.jpg');
insert into student(sno,sname,ssex,sage,sdept,photo_url) values('9521102','吴宾','女',21,'信息系','nopic.jpg');
insert into student(sno,sname,ssex,sage,sdept,photo_url) values('9521103','张海','男',20,'信息系','nopic.jpg');
insert into student(sno,sname,ssex,sage,sdept,photo_url) values('9531101','钱小平','女',18,'数学系','nopic.jpg');
insert into student(sno,sname,ssex,sage,sdept,photo_url) values('9531102','王大力','男',19,'数学系','nopic.jpg');
insert into student(sno,sname,ssex,sage,sdept,photo_url) values('9512104','张健','男',19,'计算机系','nopic.jpg');
insert into student(sno,sname,ssex,sage,sdept,photo_url) values('9512105','张齐朴','男',19,'计算机系','nopic.jpg');

insert into course values('01','数据处理',2);
insert into course values('02','数学',3);
insert into course values('03','操作系统',2);
insert into course values('04','C 语言程序设计',3);
insert into course values('05','数据结构',4);
insert into course values('06','数据库',3);
insert into course values('07','信息系统',2);

insert into teacher(tno,tname,tsex,tpost,tdept) values('1512101','李勇洋','男','院长','计算机系');
insert into teacher(tno,tname,tsex,tpost,tdept) values('1512102','李勇宸','男','副院长','数学计算机系');
insert into teacher(tno,tname,tsex,tpost,tdept) values('1512103','李勇敏','男','主任','信息计算机系');
insert into teacher(tno,tname,tsex,tpost,tdept) values('1512104','李勇归','男','教授','计算机系');
insert into teacher(tno,tname,tsex,tpost,tdept) values('1512105','李勇旺','男','讲师','计算机系');

insert into sc values('9512101','01',92);
insert into sc values('9512101','02',85);
insert into sc values('9512101','03',88);
insert into sc values('9512102','02',90);
insert into sc values('9512102','03',100);
insert into sc values('9512102','01',null);

insert into tc values('1512101','01','6305');
insert into tc values('1512101','03','6315');
insert into tc values('1512102','02','6205');
insert into tc values('1512102','04','6505');
insert into tc values('1512105','05','1505');
insert into tc values('1512103','06','2505');
insert into tc values('1512104','07','6225');



select * from teacher where tno='1512101';
select * from student where sno='9512102';
select * from course where cno='04';
select * from userd where userid='1512101';
select grade from sc where sno='9512101' and cno='02';


select * from student,userd where sno = userd.userid;
select student.sno, student.sname, student.ssex, student.sage ,student.sdept from student inner join userd on
student.sno = userd.userid;
select student.sno,student.sname,student.ssex,student.sage,student.sdept,student.photo_url from student inner join userd on student.sno = userd.userid

select cno from sc where sno='9512101'; 
select course.*,sc.grade,tc.classroom  from sc,course,tc where sc.sno='9512101' and sc.cno = course.cno and course.cno = tc.cno
select course.*,sc.grade,tc.classroom,teacher.tname from sc,course,tc,teacher where sc.sno='9512102' and sc.cno = course.cno and course.cno = tc.cno and tc.tno = teacher.tno
select count(*) as counts from sc,userd where sc.sno=userd.userid;


select count(*) from course  where cno not in (select sc.cno from sc where sc.sno = '9512101');
select course.* from course where cno not in (select sc.cno from sc where sc.sno = '9512101'); 
select course.*,tc.classroom,teacher.tname from course,tc,teacher where course.cno not in (select sc.cno from sc where sc.sno = '9512102') and course.cno = tc.cno and tc.tno = teacher.tno

select course.*,sc.grade,tc.classroom,teacher.tname from sc,userd,course,tc,teacher where sc.sno=userd.userid and sc.cno = course.cno and course.cno = tc.cno and tc.tno = teacher.tno

select student.sno,student.sname,student.ssex,student.sage,student.sdept,student.photo_url from student inner join userd on student.sno = userd.userid

select count(*) as counts from sc inner join userd on sc.sno=userd.userid


select course.*,sc.grade,tc.classroom,teacher.tname from sc,userd,course,tc,teacher where sc.sno=userd.userid and sno='9512101' and sc.cno = course.cno and course.cno = tc.cno and tc.tno = teacher.tno


select count(*) as counts from tc inner join userd on tc.tno=userd.userid and tno='1512101'
select course.*,tc.classroom,teacher.tname from userd,course,tc,teacher where tc.tno=userd.userid and tno='1512101' and tc.cno = course.cno  and tc.tno = teacher.tno

select count(*) as counts from (tc inner join userd on tc.tno=userd.userid and tno='1512101') inner join sc on tc.cno = sc.cno
select student.sno,student.sname,course.*,sc.grade from student,sc,userd,course,tc where tc.tno=userd.userid and tno='1512101' and tc.cno = sc.cno and sc.cno = course.cno and sc.sno = student.sno
