-- begin MATRIX_CALL
alter table MATRIX_CALL add constraint FK_MATRIX_CALL_OPERATOR foreign key (OPERATOR_ID) references MATRIX_OPERATOR(ID)^
create index IDX_MATRIX_CALL_OPERATOR on MATRIX_CALL (OPERATOR_ID)^
-- end MATRIX_CALL