create table spring_boot_actual_combat.properties
  (
      id               int(11) auto_increment comment '主键Id',
      properties_key   varchar(255) not null comment '属性名',
      properties_value varchar(255) not null comment '属性值',
      application      varchar(255) not null comment '应用名',
      profile          varchar(255) not null comment '环境',
      label            varchar(255) not null comment '分支',
      primary key (id)
  );

INSERT INTO `properties` (`properties_key`, `properties_value`, `application`, `profile`, `label`) VALUES ('name', 'berry', 'application', 'dev', 'master');