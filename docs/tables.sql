create table `product_info` (
	`product_id` varchar(32) not null,
	`product_name` varchar(64) not null comment "product name",
	`product_price` decimal(8,2) not null comment "unit price",
	`product_stock` int not null comment "product stock",
	`product_description` varchar(64) comment "product description",
	`product_icon` varchar(512) comment "small image",
	`product_status` tinyint(3) DEFAULT '0' COMMENT 'product status,0 = in store, 1 = unavaiable',
	`category_type` int not null comment "category type number",
	`create_time` timestamp not null default current_timestamp comment "time created",
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment "time updated",
	primary key (`product_id`)
) comment "product table";


INSERT INTO `product_info` (`product_id`, `product_name`, `product_price`, `product_stock`, `product_description`, `product_icon`, `product_status`, `category_type`, `create_time`, `update_time`)
VALUES
	('1423113435324', 'pumpkin pie', 8.00, 100, 'Home-made pumpkin pie', 'https://food.fnr.sndimg.com/content/dam/images/food/fullset/2013/11/26/0/FN_Pumpkin-Pie_s4x3.jpg.rend.hgtvcom.826.620.suffix/1386172256183.jpeg', 0, 2, '2020-03-10 21:10:39', '2020-03-10 21:10:53'),
	('123457', 'ham sandwitch', 4.00, 200, 'Wholesome sandwich', 'https://indianakitchen.com/wp-content/uploads/2015/03/Ham-Sandwich.jpg', 0, 2, '2020-03-10 21:11:50', '2020-03-10 21:12:11');

-- Category
create table `category_info`(
	#int is enough
	`category_id` int not null auto_increment,
	`category_name` varchar(64) not null comment "category name",
	#category type is customized by seller
	`category_type` int not null comment "type number",
	`create_time` timestamp not null default current_timestamp comment "time created",
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment "time updated",
	primary key (`category_id`),
	unique key `uqe_category_type` (`category_type`)
) comment "product category table";


INSERT INTO `category_info` (`category_id`, `category_name`, `category_type`, `create_time`, `update_time`)
VALUES
	(1,'Popular',1,'2020-02-28 16:40:22','2020-02-28 23:39:36'),
	(2,'New',2,'2020-02-28 17:38:46','2020-02-28 23:39:40');


create table `order_master` (
	`order_id` varchar(32) not null,
	`first_name` varchar(32) not null comment "consumer''s first name",
	`last_name` varchar(32) not null comment "consumer''s last name",
	`consumer_phone` varchar(32) not null comment "consumer''s phone number",
	`consumer_address` varchar(128) not null comment "consumer''s address",
	`consumer_openid` varchar(64) not null comment "consumer''s wechat openid",
	`order_amount` decimal(8,2) not null comment "order''s total amout",
	`order_status` tinyint(3) not null default '0' comment "order status, default: 0=new order",
	`pay_status` tinyint(3) not null default '0' comment "payment status, default: 0=new order",
	`create_time` timestamp not null default current_timestamp comment "time created",
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment "time updated",
	primary key (`order_id`),
	key `idx_consumer_openid` (`consumer_openid`)
) comment "master order table";


create table `order_detail`(
	`detail_id` varchar(32) not null,
	`order_id` varchar(32) not null,
	`product_id` varchar(32) not null,
	`product_name` varchar(64) not null comment "product name",
	`product_price` decimal(8,2) not null comment "unit price",
	`product_quantity` int not null comment "purchased quantity",
	`product_icon` varchar(512) comment 'product image',
	`create_time` timestamp not null default current_timestamp comment "time created",
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment "time updated",
	primary key (`detail_id`),
	key `idx_order_id` (`order_id`)
) comment "order detail table";
