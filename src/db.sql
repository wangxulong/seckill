--数据库初始脚本

--创建数据库
create database seckill;
--使用数据库
use seckill;
--创建秒杀数据库
create table seckill(
   seckill_id bigint not null auto_increment comment '商品ID',
   name varchar(120) not null comment '名称',
   start_time  timestamp not null,
   end_time  timestamp not null,
   create_time  timestamp not null default current_timestamp,
    primary key(seckill_id),
    key idx_start_time(start_time),
    key idx_end_time(end_time),
    key idx_create_time(create_time)
)engine = InnoDB AUTO_INCREMENT=1000 default charset=utf8 comment='秒杀库存';
alter table seckill add column  num int unsigned  not null;

--插入数据
insert into seckill  (name,num,start_time,end_time)
values
('秒杀iphone6s',1000,'2016-10-01 00:00:00','2016-10-02 00:00:00'),
('秒杀ipad',100,'2016-10-01 00:00:00','2016-10-02 00:00:00')

--创建明细表
CREATE  table success_killed(
  seckill_id bigint not null ,
  user_phone char(11) not null,
  state tinyint not null default -1 comment '状态：-1无效，0成功，1已付款，',
  create_time TIMESTAMP not null,
  PRIMARY KEY (seckill_id,user_phone),
  key idex_create_time(create_time)
)engine = InnoDB DEFAULT charset=utf8 comment='明细表'
