-- begin MATRIX_OPERATOR
create table MATRIX_OPERATOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(50),
    --
    primary key (ID)
)^
-- end MATRIX_OPERATOR
-- begin MATRIX_CALL
create table MATRIX_CALL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_OF_CALL date,
    DESCRIPTION varchar(255),
    CUSTOMER varchar(50),
    OPERATOR_ID varchar(36),
    --
    primary key (ID)
)^
-- end MATRIX_CALL
