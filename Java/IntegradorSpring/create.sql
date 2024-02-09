create table conditions (id int identity not null, name varchar(255), primary key (id));
create table countries (id int not null, name varchar(255), primary key (id));
create table order_states (id int identity not null, name varchar(255), primary key (id));
create table orders (created_at date, deleted_at date, delivery_date date, emision_date date, estimated_delivery_date date, id int identity not null, order_state_id int not null, supplier_id int not null, total float(53), updated_at date, address varchar(255), primary key (id));
create table product_categories (created_at date, deleted_at date, id int identity not null, updated_at date, description varchar(255), name varchar(255), primary key (id));
create table products (created_at date, deleted_at date, id int identity not null, price float(53), product_category_id int not null, supplier_id int not null, updated_at date, description varchar(255), image_url varchar(255), name varchar(255), sku_code varchar(255), primary key (id));
create table products_per_order (order_id int not null, product_id int not null, quantity int, primary key (order_id, product_id));
create table states (country_id int not null, id int not null, name varchar(255), primary key (id));
create table supplier_categories (created_at date, deleted_at date, id int identity not null, updated_at date, name varchar(255), primary key (id));
create table suppliers (condition_id int not null, country_id int not null, created_at date, deleted_at date, id int identity not null, state_id int not null, supplier_category_id int not null, updated_at date, address varchar(255), code varchar(255), contact_email varchar(255), contact_name varchar(255), contact_phone varchar(255), contact_role varchar(255), contact_surname varchar(255), cuit varchar(255), district varchar(255), email varchar(255), logo_image_url varchar(255), name varchar(255), phone varchar(255), website varchar(255), zip_code varchar(255), primary key (id));
create table users (created_at date, deleted_at date, id int identity not null, updated_at date, email varchar(255), password varchar(255), primary key (id));
create unique nonclustered index UK_87kwpqube5sx7yqlq6v4a7btd on products (sku_code) where sku_code is not null;
create unique nonclustered index UK_8kh5crh75ye2imfi5yv37p61o on suppliers (code) where code is not null;
alter table orders add constraint FK10at1e480s4me9swug6rs3dax foreign key (order_state_id) references order_states;
alter table orders add constraint FKg2540vs5sg5b0uov81t6p0229 foreign key (supplier_id) references suppliers;
alter table products add constraint FKe05mpyhp4howtq8q4s65wm3q8 foreign key (product_category_id) references product_categories;
alter table products add constraint FK6i174ixi9087gcvvut45em7fd foreign key (supplier_id) references suppliers;
alter table products_per_order add constraint FK5h3u1c8o7hjm7ibvvb04gomno foreign key (order_id) references orders;
alter table products_per_order add constraint FKkfdco0nmwgqqqa3d6wx56lh1o foreign key (product_id) references products;
alter table states add constraint FKskkdphjml9vjlrqn4m5hi251y foreign key (country_id) references countries;
alter table suppliers add constraint FKfwifolj9wthr9rdc6w6vmonxr foreign key (condition_id) references conditions;
alter table suppliers add constraint FKjcuohexsi23vnpxi0t25kvwg7 foreign key (country_id) references countries;
alter table suppliers add constraint FKnnnkfero9r7sbl2xxa1sxlxj9 foreign key (state_id) references states;
alter table suppliers add constraint FK15ennrtsq71w38v51iyryvlts foreign key (supplier_category_id) references supplier_categories;