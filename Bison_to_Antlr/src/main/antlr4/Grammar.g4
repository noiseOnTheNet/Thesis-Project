grammar Grammar;
start: input EOF;

input: instructions;
instructions
            : instruction                                   #instructions_
            | instructions instruction                      #instructions_instruction;

list_of_id_args:                                            #list_of_id_args_
            | id                                            #list_of_id_args_id
            | id '=' no_comma_expr                          #list_of_id_args_set_no_comma_expr_to_id
            | FESPACE id                                    #list_of_id_args_fespace_id
            | FESPACE '&' id                                #list_of_id_args_fespace_and_id
            | FESPACE3 id                                   #list_of_id_args_fespace3_id
            | FESPACE3 '&' id                               #list_of_id_args_fespace3_and_id
            | FESPACES id                                   #list_of_id_args_fespaceS_id
            | FESPACES '&' id                               #list_of_id_args_fespaceS_and_id
            | FESPACEL id                                   #list_of_id_args_fespaceL_id
            | FESPACEL '&' id                               #list_of_id_args_fespaceL_and_id
            | type_of_dcl id                                #list_of_id_args_type_of_dcl_id
            | type_of_dcl '&' id                            #list_of_id_args_type_of_dcl_and_id
            | '[' list_of_id_args ']'                       #list_of_id_args_array
            | list_of_id_args ',' id                        #list_of_id_args_comma_id
            | list_of_id_args ',' '[' list_of_id_args ']'   #list_of_id_args_comma_array
            | list_of_id_args ',' id '=' no_comma_expr      #list_of_id_args_comma_id_no_comma_expr
            | list_of_id_args ',' FESPACE id                #list_of_id_args_comma_fespace_id
            | list_of_id_args ',' FESPACE '&' id            #list_of_id_args_comma_fespace_and_id
            | list_of_id_args ',' FESPACE3 id               #list_of_id_args_comma_fespace3_id
            | list_of_id_args ',' FESPACE3 '&' id           #list_of_id_args_comma_fespace3_and_id
            | list_of_id_args ',' FESPACES id               #list_of_id_args_comma_fespaceS_id
            | list_of_id_args ',' FESPACES '&' id           #list_of_id_args_comma_fespaceS_and_id
            | list_of_id_args ',' FESPACEL id               #list_of_id_args_comma_fespaceL_id
            | list_of_id_args ',' FESPACEL '&' id           #list_of_id_args_comma_fespaceL_and_id
            | list_of_id_args ',' type_of_dcl id            #list_of_id_args_comma_type_of_dcl_id
            | list_of_id_args ',' type_of_dcl '&' id        #list_of_id_args_comma_type_of_dcl_and_id
            ;

list_of_id1
            : id                                            #list_of_id1_id
            | list_of_id1 ',' id                            #list_of_id1_comma_id
            ;

id
            : ID                                            #id_id
            | FESPACE                                       #id_fespace
            | FESPACE3                                      #id_fespace3
            | FESPACES                                      #id_fespaceS
            | FESPACEL                                      #id_fespaceL
            | FESPACE1                                      #id_fespace1
            ;

list_of_dcls
            : ID                                            #list_of_dcls_id
            | ID '=' no_comma_expr                          #list_of_dcls_id_no_comma_expr
            | ID '(' parameters_list ')'                    #list_of_dcls_id_parameters_list
            | list_of_dcls ',' list_of_dcls                 #list_of_dcls_comma
            ;

parameters_list
            : no_set_expr                                   #parameters_list_no_set_expr
            | FESPACE ID                                    #parameters_list_fespace_id
            | FESPACE1 ID                                   #parameters_list_fespace1_id
            | FESPACE3 ID                                   #parameters_list_fespace3_id
            | FESPACES ID                                   #parameters_list_fespaceS_id
            | FESPACEL ID                                   #parameters_list_fespaceL_id
            | ID '=' no_set_expr                            #parameters_list_id_no_set_expr
            | parameters_list ',' no_set_expr               #parameters_list_comma_no_set_expr
            | parameters_list ',' id '=' no_set_expr        #parameters_list_comma_id_no_set_expr
            ;

type_of_dcl
            : ID /*TYPE*/                                   #type_of_dcl_id
            | ID '[' ID ']' /*TYPE TYPE*/                   #type_of_dcl_id_array
            | ID '[' ID ']' '[' ID ']'                      #type_of_dcl_id_array_array
            | ID '[' ID ',' ID ']'                          #type_of_dcl_id_matrix
            | ID '[' ID ',' ID ']' '[' ID ']'               #type_of_dcl_id_matrix_array
            | ID '<' ID '>'                                 #type_of_dcl_id_vector
            | ID '<' ID '>' '[' ID ']'                      #type_of_dcl_id_vector_array
            | ID '<' ID '>' '[' ID ',' ID ']'               #type_of_dcl_id_vector_matrix
            ;

id_space
            : ID                                            #id_space_id
            | ID '[' no_set_expr ']'                        #id_space_array_no_set_expr
            | ID '=' no_set_expr                            #id_space_no_set_expr
            | '[' list_of_id1 ']'                           #id_space_array_list_of_id1
            | '[' list_of_id1 ']' '[' no_set_expr ']'       #id_space_array_list_of_id1_array_no_set_expr
            | '[' list_of_id1 ']' '=' no_set_expr           #id_space_array_list_of_id1_no_set_expr
            ;

id_array_space
            : ID '(' no_set_expr ')'                        #id_array_space_id_no_set_expr
            | '[' list_of_id1 ']' '(' no_set_expr ')'       #id_array_space_array_list_of_id1_no_set_expr
            ;

fespace123
            : FESPACE                                       #fespace123_fespace
            | FESPACE1                                      #fespace123_fespace1
            | FESPACE3                                      #fespace123_fespace3
            | FESPACES                                      #fespace123_fespaceS
            | FESPACEL                                      #fespace123_fespaceL
            ;

fespace
            : fespace123                                    #fespace_fespace123
            | fespace123 '<' ID '>' /*TYPE*/                #fespace_fespace123_vector
            ;

spaceIDa
            : id_array_space                                #spaceIDa_id_array_space
            | spaceIDa ',' id_array_space                   #spaceIDa_comma_id_array_space
            ;

spaceIDb
            : id_space                                      #spaceIDb_id_space
            | spaceIDb ',' id_space                         #spaceIDb_comma_id_space
            ;

spaceIDs
            : fespace spaceIDb                              #spaceIDs_fespace_spaceIDb
            | fespace '[' ID ']' spaceIDa /*TYPE*/          #spaceIDs_fespace_array_ID_spaceIDa
            ;

fespace_def: ID '(' parameters_list ')' ;

fespace_def_list
            : fespace_def                                   #fespace_def_list_fespace_def
            | fespace_def_list ',' fespace_def              #fespace_def_list_comma_fespace_def
            ;

declaration
            : type_of_dcl list_of_dcls ';'                  #declaration_type_of_dcl_list_of_dcls
            | type_of_dcl list_of_dcls '=' instruction      #declaration_type_of_dcl_list_of_dcls_instruction   //added
            | FESPACE fespace_def_list ';'                  #declaration_fespace_def_list
            | spaceIDs ';'                                  #declaration_spaceIDs
            | FUNCTION ID '=' expr ';'                      #declaration_function_id_expr
            | FUNCTION type_of_dcl ID '(' list_of_id_args ')' '{' instructions'}'   #declaration_function_type_of_dcl_id
            | FUNCTION ID '(' list_of_id_args ')' '=' no_comma_expr ';'     #function_id_list_of_id_args
            ;

begin: '{' ;
end: '}' ;

for_loop: 'for';
while_loop: 'while';

declaration_for: type_of_dcl list_of_dcls;

try_: 'try';

idfor
            : id                                            #idfor_id
            | id ',' id                                     #idfor_comma_id
            | id ',' id ',' id                              #idfor_comma_id_comma_id
            ;

instruction
            : ';'                                           #instruction_
            | 'include' STRING                              #instruction_include_string
            | 'load' STRING                                 #instruciotn_load_string //*
            | try_ '{' instructions '}' catchs               #instruction_try_instructions_catchs
            | expr ';'                                      #instruction_expr
            | declaration                                   #instruction_declaration
            | for_loop '[' idfor ':' primary ']' instruction    #for_loop_idfor_primary_instruction
            | for_loop '(' expr ';' expr ';' expr ')' instruction   #instruction_for_loop
            | for_loop '(' declaration_for ';' expr ';' expr ')' instruction    #instruction_declaration_for_expr_expr_instruction
            | while_loop '(' expr ')' instruction           #instruction_while_loop
            | 'if' '(' expr ')' instruction                 #instruction_if
            | 'if' '(' expr ')' instruction 'else' instruction  #instruction_if_else
            | begin instructions end                        #instruction_begin_end
            | 'border' ID border_expr                       #instruction_border_id_border_expr
            | 'border' ID '[' array ']' ';'                 #instruction_border_id_array
            | 'break' ';'                                   #instruction_break
            | 'continue' ';'                                #instruction_continue
            | 'return' expr ';'                             #instruction_return
            ;

catchs: 'catch' '(' '.' '.' '.' ')' instruction;

bornes
            : '(' ID '=' expr ',' expr ')'                  #bornes_id_expr_expr
            | '(' ID '=' expr ',' expr ';' ID ')'           #bornes_id_expr_expr_id
            ;

border_expr: bornes instruction ;

expr
            : no_comma_expr                                 #expr_no_comma_expr
            | expr ',' expr                                 #expr_comma
            ;

unop
            : '-'                                           #unop_minus
            | '+'                                           #unop_plus
            | '!'                                           #unop_not
            | '++'                                          #unop_increment
            | '--'                                          #unop_decrement
            ;

no_comma_expr
            : no_set_expr                                   #no_comma_expr_no_set_expr
            | no_set_expr '=' no_comma_expr                 #no_comma_expr_equal
            | no_set_expr '+=' no_comma_expr                #no_comma_expr_plusEqual
            | no_set_expr '-=' no_comma_expr                #no_comma_expr_minusEqual
            | no_set_expr '*=' no_comma_expr                #no_comma_expr_multEqual
            | no_set_expr '/=' no_comma_expr                #no_comma_expr_divideEqual
            | no_set_expr '.*=' no_comma_expr               #no_comma_expr_dot_multEqual //*
            | no_set_expr './=' no_comma_expr               #no_comma_expr_dot_divideEqual //*
            ;

no_set_expr
            : no_ternary_expr                               #no_set_expr_no_ternary_expr //*
            | no_ternary_expr '?' no_ternary_expr ':' no_ternary_expr   # no_set_expr_no_ternary_expr_if_no_ternary_expr //modified*
            | no_ternary_expr ':' no_ternary_expr           #no_set_expr_no_ternary_expr_colon
            | no_ternary_expr ':' no_ternary_expr ':' no_ternary_expr   #no_set_expr_no_ternary_expr_colon_no_ternary_expr
            ;

no_ternary_expr
            : unary_expr                                    #no_ternary_expr_unary_expr  //*
            | no_ternary_expr '*' no_ternary_expr           #no_ternary_expr_multiply  //*
            | no_ternary_expr '.*' no_ternary_expr          #no_ternary_expr_dotMultiply //*
            | no_ternary_expr './' no_ternary_expr          #no_ternary_expr_dotDivide  //*
            | no_ternary_expr '/' no_ternary_expr           #no_ternary_expr_divide  //*
            | no_ternary_expr '%' no_ternary_expr           #no_ternary_expr_modulus  //*
            | no_ternary_expr '+' no_ternary_expr           #no_ternary_expr_plus  //*
            | no_ternary_expr '-' no_ternary_expr           #no_ternary_expr_minus  //*
            | no_ternary_expr '<<' no_ternary_expr          #no_ternary_expr_out  //*
            | no_ternary_expr '>>' no_ternary_expr          #no_ternary_expr_in  //*
            | no_ternary_expr '&' no_ternary_expr           #no_ternary_expr_and  //*
            | no_ternary_expr '&&' no_ternary_expr          #no_ternary_expr_andand  //*
            | no_ternary_expr '|' no_ternary_expr           #no_ternary_expr_or  //*
            | no_ternary_expr '||' no_ternary_expr          #no_ternary_expr_oror  //*
            | no_ternary_expr '<' no_ternary_expr           #no_ternary_expr_less  //*
            | no_ternary_expr '<=' no_ternary_expr          #no_ternary_expr_lessEqual  //*
            | no_ternary_expr '>' no_ternary_expr           #no_ternary_expr_greater  //*
            | no_ternary_expr '>=' no_ternary_expr          #no_ternary_expr_greaterEqual  //*
            | no_ternary_expr '==' no_ternary_expr          #no_ternary_expr_equal  //*
            | no_ternary_expr '!=' no_ternary_expr          #no_ternary_expr_notEqual  //*
            ;

sub_script_expr
            : no_ternary_expr                               #sub_script_expr_no_ternary_expr//modified*
            | ':'                                           #sub_script_expr_colon//*
            | no_ternary_expr ':' no_ternary_expr           #sub_script_expr_no_ternary_expr_colon_no_ternary_expr//modifed*
            | no_ternary_expr ':' no_ternary_expr ':' no_ternary_expr   #sub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_expr//modified*
            ;

parameterstype: sub_script_expr ',' parameters;

parameters
            :                                               #parameters_ //modified
            | FESPACE                                       #parameters_fespace
            | FESPACE1                                      #parameters_fespace1
            | FESPACE3                                      #parameters_fespace3
            | FESPACES                                      #parameters_fespaceS
            | FESPACEL                                      #parameters_fespaceL
            | id '=' no_set_expr                            #parameters_id_equal_no_set_expr
            | sub_script_expr                               #parameters_sub_scripts_expr
            | parameters ',' FESPACE                        #parameters_comma_fespace
            | parameters ',' FESPACE1                       #parameters_comma_fespace1
            | parameters ',' FESPACE3                       #parameters_comma_fespace3
            | parameters ',' FESPACES                       #parameters_comma_fespaceS
            | parameters ',' FESPACEL                       #parameters_comma_fespaceL
            | parameters ',' sub_script_expr                #parameters_comma_sub_script_expr //modified
            | parameters ',' id '=' no_set_expr             #parameters_comma_id_equal_no_set_expr
            ;

array
            : no_comma_expr                                 #array_no_comma_expr
            | array ',' no_comma_expr                       #array_comma_no_comma_expr
            ;

unary_expr
            : pow_expr                                      #unary_expr_pow_expr
            | unop pow_expr /*%prec UNARY*/                 #unary_expr_unop_pow_expr
            ;

pow_expr
            : primaryp                                       #pow_expr_primary
            | primaryp '^' unary_expr                        #pow_expr_power
            | primaryp '_' unary_expr                        #pow_expr_underscore
            ;

primaryp
            : primary                                       #primaryp_primary
            | primary '\''                                  #primaryp_primary_transpose
            ;

primary
            : ID                                            #primary_id
            | LNUM                                          #primary_lnum
            | DNUM                                          #primary_dnum
            | CNUM                                          #primary_cnum
            | STRING                                        #primary_string
            | primary '(' parameters ')'                    #primary_parameters
            | primary '[' sub_script_expr ']'               #primary_array_sub_script_expr //modified
            | primary '[' sub_script_expr ',' sub_script_expr ']'   #primary_matrix
            | primary '[' ']'                               #primary_empty_array
            | primary '.' ID                                #primary_dot_id
            | FESPACE '.' ID                                #primary_fespace_dot_id
            | FESPACE '(' parameters ')'                    #primary_fespace_parameters
            | FESPACE1 '.' ID                               #primary_fespace1_dot_id
            | FESPACE1 '(' parameters ')'                   #primary_fespace1_parameters
            | FESPACE3 '.' ID                               #primary_fespace3_dot_id
            | FESPACE3 '(' parameters ')'                   #primary_fespace3_parameters
            | FESPACES '.' ID                               #primary_fespaceS_dot_id
            | FESPACES '(' parameters ')'                   #primary_fespaceS_parameters
            | FESPACEL '.' ID                               #primary_fespaceL_dot_id
            | FESPACEL '(' parameters ')'                   #primary_fespaceL_parameters
            | primary '++'                                  #primary_increment
            | primary '--'                                  #primary_decrement
            | ID '(' sub_script_expr ')' /*TYPE*/           #primary_id_sub_script_expr //modified
            | ID '(' parameterstype ')' /*TYPE*/            #primary_id_parameterstype
            | '(' expr ')'                                  #primary_expr
            | '[' array ']'                                 #primary_array_
            ;

FESPACE  : 'fespace';
FESPACE1 : 'fespace1';
FESPACE3 : 'fespace3';
FESPACES : 'fespaces';
FESPACEL : 'fespacel';
FUNCTION : 'func';
//TYPE     : [a-zA-Z]*;
STRING   : '"' .*? '"';
ID       : [a-zA-Z][a-zA-Z0-9_]*;
LNUM     : [0-9e]+;
DNUM     : [0-9e]+ (['.'0-9e]+)?;
CNUM     : [-]? DNUM? [+-]? DNUM?[i];
WS       : [ \n\u000D] -> skip ;