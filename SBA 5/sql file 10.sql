create database project_movie_data;
use project_movie_data;

create table actor(
act_id int primary key auto_increment,
act_fname varchar(45),
act_lname varchar(45),
act_gender enum('M','F')
)auto_increment=101;

create table director(
dir_id int primary key auto_increment,
dir_fname varchar(45),
dir_lname varchar(45)
)auto_increment=201;
select * from director;
create table movie_direction(
dir_id int not null,
mov_id int not null,
foreign key(dir_id) references director(dir_id),
foreign key(mov_id) references movie(mov_id)
);
create table movie_cast(
act_id int not null,
mov_id int not null,
role varchar(30),
foreign key(act_id) references actor(act_id),
foreign key(mov_id) references movie(mov_id)
);
create table movie(
mov_id int primary key auto_increment,
mov_title varchar(50),
mov_year int not null,
mov_time int not null,
mov_lang varchar(50) not null,
mov_dt_rel date,
mov_rel_country varchar(10)
)auto_increment=901;



create table reviewer(
rev_id int primary key auto_increment,
rev_name varchar(30)
)auto_increment=9001;

create table genres(
gen_id int primary key auto_increment,
gen_title varchar(20)
)auto_increment=1001;

create table movie_generes(
mov_id int not null,
gen_id int not null,
foreign key(mov_id) references movie(mov_id),
foreign key(gen_id) references genres(gen_id)
);

create table rating(
mov_id int not null,
rev_id int not null,
rev_stars int,
num_o_ratings int,
foreign key(mov_id) references movie(mov_id),
foreign key(rev_id) references reviewer(rev_id) );

show tables;

INSERT INTO director(dir_fname,dir_lname)
values('Alfred','Hitchcock'),('Jack','Clayton'),('David','Lean'),
('Michael','Cimino'),('Milos','Forman'),('Ridley','Scott'),
('Stanley','Kubrick'),('Bryan','Singer'),('Roman','olanski'),
('Paul','Thomas Anderson'),('Woody','Allen'),('Hayao','Miyazaki'),
('Frank','Darabont'),('Sam','Mendes'),('James','Cameron'),
('Gus',' Van Sant'),('John',' Boorman'),('Danny','Boyle'),
('Christopher','Nolan'),('Richard','Kelly'),('Kevin','Spacey'),
('Andrei','Tarkovsky'),('Peter','Jackson');
select * from director;

insert into movie(mov_title,mov_year,mov_time,mov_lang,mov_dt_rel,mov_rel_country)
values('Vertigo',1958,128,'English','1958-08-24','UK'),('The Innocents',1961,100,'English','1962-02-19','SW'),
('Lawrence of Arabia',1962,216,'English','1962-12-11','UK'),('The Deer Hunter',1978,183,'English','1979-03-08','UK'),
('Amadeus',1984,160,'English','1985-01-07','UK'),('Blade Runner',1982,117,'English','1982-09-09','UK'),
('Eyes Wide Shut',1999,159,'English',null,'UK'),('The Usual Suspects',1995,106,'English','1995-08-09','UK'),
('Chinatown',1974,130,'English','1974-08-09','UK'),('Boogie Nights',1997,155,'English','1998-02-16','UK'),('Annie Hall',1977,93,'English','1977-04-20','USA'),
('Princess Mononoke',1997,134,'Japanese','2001-10-19','UK'),('The Shawshank Redemption','1994','142','English',' 1995-02-17','UK'),('American Beauty',1999,122,'English',null,'UK'),
('Titanic',1997,194,'English','1998-01-23','UK'),('Good Will Hunting',1997,126,'English','1998-06-03','UK'),('Deliverance',1972,109,'English','1982-10-05','UK'),
('Trainspotting',1996,94,'English','1996-02-23','UK'),('The Prestige',2006,130,'English','2006-11-10','UK'),('Donnie Darko',2001,113,'English',null,'UK'),
('Slumdog Millionaire',2008,120,'English','2009-01-09','UK'),('Aliens',1986,137,'English','1986-08-29','UK'),('Beyond the Sea',2004,118,'English','2004-11-26','UK'),
('Avatar',2009,162,'English','2009-12-17','UK'),('Seven Samurai',1954,207,'Japanese','1954-04-26','JP'),('Spirited Away',2001,125,'Japanese','2003-09-12','UK'),
('Back to the Future',1985,116,'English','1985-12-04','UK'),('Braveheart',1995,178,'English','1995-09-08','UK');

insert into movie_direction(dir_id,mov_id)
values(201,901),(202,902),(203,903),
(204,904),(205,905),(206,906),
(207,907),(208,908),(209,909),
(210,910),(211,911),(212,912),
(213,913),(214,914),(215,915),
(216,916),(217,917),(218,918),
(219,919),(220,920),(218,921),
(215,922),(221,923); 

insert into genres(gen_title)
values('Action'),('Adventure'),('Animation'),('Biography'),
('Comedy'),('Crime'),('Drama'),('Horror'),
('Music'),('Mystery'),('Romance'),('Thriller'),
('War');

insert into actor(act_fname,act_lname,act_gender)
values('James','Stewart','M'),('Deborah','Kerr','F'),('Peter','Otoole','M'),('Robert','DeNiro','M'),
('F.Murray','Abraham','M'),('Harrison','Ford','M'),('Nicole','Kidman','F'),('Stephen','Baldwin','M'),
('Jack','Nicholson','M'),('Mark','Wahlberg','M'),('Woody','Allen','M'),('Claire','Danes','F'),
('Tim','Robbins','M'),('jon','Voight','M'),('Kevin','Spacey','M'),('Kate','Winslet','F'),('Robin','Robbins','M'),
('Ewan','McGregor','M'),('Christian','Bale','M'),('Maggie','Gyllenhaal','F'),('Dev','Patel','M'),('Sigourney','Weaver','F'),
('David','Aston','M'),('Ali','Astin','F');

insert into movie_cast(act_id,mov_id,role)
values(101,901,'John Scottie Ferguson'),(102,902,'Miss Giddens'),(103,903,'T.F.Lawrence'),(104,904,'Michael'),
(105,905,'Antonia Salieri'),(106,906,'Rick Deckard'),(107,907,'Alice Harford'),(108,908,'McManus'),
(110,910,'Eddie Adams'),(111,911,'Alvy Singer'),(112,912,'San'),(113,913,'Andy Dulresne'),(114,914,'Lester Burnham'),
(115,915,'Rose DeWitt Bukater'),(116,916,'Sean Maguire'),(117,917,'Ed'),(118,918,'Renton'),(120,920,'Elizabeth Darko'),
(121,921,'Older Jamal'),(122,922,'Ripley'),(114,923,'Bobby Darin'),(109,909,'J.J.Gittes'),(119,919,'Alfred Borden');

insert into reviewer(rev_name)
values('Righty sock'),('Jack Malven'),('Flagrant Malvern'),('Alec Shaw'),
(null),('Victor Woeltjen'),('Simon Wright'),('Neal Wruck'),
('Paul Monks'),('Mike Salvati'),(null),('Weasly S.Walker'),
('Sasha Goldshtein'),('Josh Cates'),('Krug Stillo'),('Scott LeBrun'),
('Hannah Steele'),('Vincent Cadena'),('Brandt Sponseller'),('Richard Adams');

insert into movie_generes(mov_id,gen_id)
values(922,1001),(917,1002),(903,1002),(912,1003),(911,1005),(908,1006),(913,1006),(926,1007),(928,1007),(918,1007),
(921,1007),(902,1008),(923,1009),(907,1010),(927,1010),(901,1010),(914,1011),(906,1012),(904,1013);

insert into rating(mov_id,rev_id,rev_stars,num_o_ratings)
values(901,9001,8.4,263575),(902,9002,7.9,20207),(903,9003,8.3,202778),(906,9005,8.2,484746),
(924,9006,7.3,null),(908,9007,8.6,779489),(909,9008,null,227235),(910,9009,3,195961),
(911,9010,8.1,203875),(912,9011,8.4,null),(914,9013,7,862618),(915,9001,7.7,830095),
(916,9014,4,642132),(925,9015,7.7,81328),(918,9016,null,580301),(920,9017,8.1,609451),
(921,9018,8,667758),(922,9019,8.4,511613),(923,9020,6.7,13091);
-- 3.Write a query in SQL to list the Horror movies?
select mov_title,gen_title from movie
inner join movie_generes on movie.mov_id=movie_generes.mov_id
inner join genres on genres.gen_id=movie_generes.gen_id
where genres.gen_title='Horror';
-- 4.Write a query in SQL to find the name of all reviewers who have rated 8 or more stars?
select rev_name,rev_stars from reviewer
inner join rating on reviewer.rev_id=rating.rev_id
where rev_stars>=8;
-- 5.Write a query in SQL to list all the information of the actors who played a role in the movie ‘Deliverance’
select act_fname,act_lname,act_gender,mov_title from actor
inner join movie_cast on actor.act_id=movie_cast.act_id
inner join movie on movie_cast.mov_id=movie.mov_id
where movie.mov_title='Deliverance';
-- 8 Write a query in SQL to find all the years which produced at least one movie and that received a rating of more than 4 stars.
select mov_title,rev_stars,mov_year from movie
inner join rating on movie.mov_id=rating.mov_id
where rev_stars>=4;
-- 10 Write a query in SQL to find the name of movies who were directed by ‘David’


select mov_title,dir_fname,dir_lname from movie
inner join movie_direction on movie.mov_id=movie_direction.mov_id
inner join director on movie_direction.dir_id=director.dir_id
where director.dir_fname='David' or director.dir_lname='David';
-- 11 Write a query in SQL to list the first and last names of all the actors who were cast in the movie ‘Boogie Nights’, and the roles they played in that production.
select act_fname,act_lname,mov_title,role from actor
inner join movie_cast on actor.act_id=movie_cast.act_id
inner join movie on movie_cast.mov_id=movie.mov_id
where movie.mov_title='Boogie Nights';






