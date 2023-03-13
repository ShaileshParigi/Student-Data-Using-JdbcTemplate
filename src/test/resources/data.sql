insert into student(studentName,gender,standard)
select 'John', 'Male', 1
where not exists(select 1 from student where studentId=1);

insert into student(studentName,gender,standard)
select 'David', 'Male', 2
where not exists(select 2 from student where studentId=2);


insert into student(studentName,gender,standard)
select 'William', 'Male', 3
where not exists(select 3 from student where studentId=3);


insert into student(studentName,gender,standard)
select 'Ryan', 'Male', 4
where not exists(select 4 from student where studentId=4);


insert into student(studentName,gender,standard)
select 'Jacob', 'Male', 5
where not exists(select 5 from student where studentId=5);


insert into student(studentName,gender,standard)
select 'Michael', 'Male', 6
where not exists(select 6 from student where studentId=6);


insert into student(studentName,gender,standard)
select 'Daniel', 'Male', 7
where not exists(select 7 from student where studentId=7);


insert into student(studentName,gender,standard)
select 'Benjamin', 'Male', 8
where not exists(select 8 from student where studentId=8);


insert into student(studentName,gender,standard)
select 'Henry', 'Male', 9
where not exists(select 9 from student where studentId=9);


insert into student(studentName,gender,standard)
select 'Ethan', 'Male', 10
where not exists(select 10 from student where studentId=10);


insert into student(studentName,gender,standard)
select 'Emma', 'Female', 1
where not exists(select 11 from student where studentId=11);


insert into student(studentName,gender,standard)
select 'Sophia', 'Female', 2
where not exists(select 12 from student where studentId=12);


insert into student(studentName,gender,standard)
select 'Olivia', 'Female', 3
where not exists(select 13 from student where studentId=13);


insert into student(studentName,gender,standard)
select 'Ava', 'Female', 4
where not exists(select 14 from student where studentId=14);


insert into student(studentName,gender,standard)
select 'Isabella', 'Female', 5
where not exists(select 15 from student where studentId=15);


insert into student(studentName,gender,standard)
select 'Mia', 'Female', 6
where not exists(select 16 from student where studentId=16);


insert into student(studentName,gender,standard)
select 'Charlotte', 'Female', 7
where not exists(select 17 from student where studentId=17);


insert into student(studentName,gender,standard)
select 'Amelia', 'Female', 8
where not exists(select 18 from student where studentId=18);


insert into student(studentName,gender,standard)
select 'Harper', 'Female', 9
where not exists(select 19 from student where studentId=19);


insert into student(studentName,gender,standard)
select 'Evelyn', 'Female', 10
where not exists(select 20 from student where studentId=20);

