grammar Grammar;
start: input EOF;

input: instructions;
instructions
            : instruction                                   #instructions_
            | instructions instruction                      #instructions_instruction;

list_of_id_args
            : id                                            #list_of_id_args_id
            | id '=' no_comma_expr                          #list_of_id_args_set_no_comma_expr_to_id
            | FESPACE id                                    #list_of_id_args_fespace_id
            | type_of_dcl id                                #list_of_id_args_type_of_dcl_id
            | type_of_dcl '&' id                            #list_of_id_args_type_of_dcl_and_id
            | '[' list_of_id_args ']'                       #list_of_id_args_array
            | list_of_id_args ',' id                        #list_of_id_args_comma_id
            | list_of_id_args ',' '[' list_of_id_args ']'   #list_of_id_args_comma_array
            | list_of_id_args ',' id '=' no_comma_expr      #list_of_id_args_comma_id_no_comma_expr
            | list_of_id_args ',' FESPACE id                #list_of_id_args_comma_fespace_id
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
            | ID '=' no_set_expr                            #parameters_list_id_no_set_expr
            | parameters_list ',' no_set_expr               #parameters_list_comma_no_set_expr
            | parameters_list ',' id '=' no_set_expr        #parameters_list_comma_id_no_set_expr
            ;

type_of_dcl
            : ID /*TYPE*/                                   #type_of_dcl_id
            | ID '[' ID ']' /*TYPE TYPE*/                   #type_of_dcl_id_array
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

fespace: FESPACE;

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
            | type_of_dcl list_of_dcls '=' no_comma_expr '()'   #declaration_type_of_dcl_list_of_dcls_no_comma_expr     //added
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

instruction
            : ';'                                           #instruction_
            | 'include' STRING                              #instruction_include_string
            | expr ';'                                      #instruction_expr
            | declaration                                   #instruction_declaration
            | for_loop '(' expr ';' expr ';' expr ')' instruction   #instruction_for_loop
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

bornes: '(' ID '=' expr ',' expr ')' ;

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
            ;

no_set_expr
            : unary_expr                                    #no_set_expr_unary_expr
            | no_set_expr '*' no_set_expr                   #no_set_expr_multiply
            | no_set_expr '.*' no_set_expr                  #no_set_expr_dotMultiply
            | no_set_expr './' no_set_expr                  #no_set_expr_dotDivide
            | no_set_expr '/' no_set_expr                   #no_set_expr_divide
            | no_set_expr '%' no_set_expr                   #no_set_expr_modulus
            | no_set_expr '+' no_set_expr                   #no_set_expr_plus
            | no_set_expr '-' no_set_expr                   #no_set_expr_minus
            | no_set_expr '<<' no_set_expr                  #no_set_expr_out
            | no_set_expr '>>' no_set_expr                  #no_set_expr_in
            | no_set_expr '&' no_set_expr                   #no_set_expr_and
            | no_set_expr '&&' no_set_expr                  #no_set_expr_andand
            | no_set_expr '|' no_set_expr                   #no_set_expr_or
            | no_set_expr '||' no_set_expr                  #no_set_expr_oror
            | no_set_expr '<' no_set_expr                   #no_set_expr_less
            | no_set_expr '<=' no_set_expr                  #no_set_expr_lessEqual
            | no_set_expr '>' no_set_expr                   #no_set_expr_greater
            | no_set_expr '>=' no_set_expr                  #no_set_expr_greaterEqual
            | no_set_expr '==' no_set_expr                  #no_set_expr_equal
            | no_set_expr '!=' no_set_expr                  #no_set_expr_notEqual
            ;

parameters
            : no_set_expr                                   #parameters_no_set_expr
            | FESPACE                                       #parameters_fespace
            | id '=' no_set_expr                            #parameters_id_equal_no_set_expr
            | parameters ',' FESPACE                        #parameters_comma_fespace
            | parameters ',' no_set_expr                    #parameters_comma_no_set_expr
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
            : primary                                       #pow_expr_primary
            | primary '^' unary_expr                        #pow_expr_power
            | primary '_' unary_expr                        #pow_expr_underscore
            | primary '´'  /* transpose*/                   #pow_expr_transpose
            ;

primary
            : ID                                            #primary_id
            | LNUM                                          #primary_lnum
            | DNUM                                          #primary_dnum
            | CNUM                                          #primary_cnum
            | STRING                                        #primary_string
            | primary '(' parameters ')'                    #primary_parameters
            | primary '[' expr ']'                          #primary_array
            | primary '[' ']'                               #primary_empty_array
            | primary '.' ID                                #primary_dot_id
            | primary '++'                                  #primary_increment
            | primary '--'                                  #primary_decrement
            | ID '(' expr ')' /*TYPE*/                      #primary_id_expr
            | '(' expr ')'                                  #primary_expr
            | '[' array ']'                                 #primary_array_
            ;

FESPACE  : 'fespace';
FUNCTION : 'func';
//TYPE     : [a-zA-Z]*;
STRING   : '"' .*? '"';
ID       : [a-zA-Z][a-zA-Z0-9_]*;
LNUM     : [0-9]+;
DNUM     : [0-9]+ ('.' [0-9]+)?;
CNUM     : [-]? DNUM? [+-]? DNUM?[i];
WS       : [ \n\u000D] -> skip ;