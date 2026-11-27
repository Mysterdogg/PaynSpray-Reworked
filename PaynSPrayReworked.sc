{$CLEO .cs}
Alloc($PLAYER_ACTOR, 3)
Alloc($PLAYER_CHAR, 2)

script_name "PNSRWK"
3@ = 0
4@ = 0
7@ = 0

:PNSRWK_31
gosub @PNSRWK_2760
gosub @PNSRWK_9913
gosub @PNSRWK_8921
gosub @PNSRWK_8582
gosub @PNSRWK_12689
30@ = 0

:PNSRWK_73
wait 0
gosub @PNSRWK_8181
if 
  1@ > 0
goto_if_false @PNSRWK_159
if 
  is_key_pressed 1@
goto_if_false @PNSRWK_159

:PNSRWK_118
wait 0
if 
  is_key_pressed 1@
goto_if_false @PNSRWK_145
goto @PNSRWK_118

:PNSRWK_145
3@ = 1
goto @PNSRWK_31

:PNSRWK_159
if 
  5@ == 1
goto_if_false @PNSRWK_73
if 
  is_player_playing $PLAYER_CHAR
goto_if_false @PNSRWK_73
gosub @PNSRWK_6623
if 
  7@ == 0
goto_if_false @PNSRWK_232
gosub @PNSRWK_342
goto @PNSRWK_73

:PNSRWK_232
if 
  7@ == 1
goto_if_false @PNSRWK_264
gosub @PNSRWK_1769
goto @PNSRWK_73

:PNSRWK_264
if 
  7@ == 2
goto_if_false @PNSRWK_296
gosub @PNSRWK_2147
goto @PNSRWK_73

:PNSRWK_296
if 
  7@ == 3
goto_if_false @PNSRWK_328
gosub @PNSRWK_2404
goto @PNSRWK_73

:PNSRWK_328
gosub @PNSRWK_2509
goto @PNSRWK_73

:PNSRWK_342
if 
  is_char_in_any_car $PLAYER_ACTOR
goto_if_false @PNSRWK_399
8@ = store_car_char_is_in_no_save $PLAYER_ACTOR
9@ = get_vehicle_pointer 8@
gosub @PNSRWK_5963
if 
  27@ == 0
goto_if_false @PNSRWK_422

:PNSRWK_399
gosub @PNSRWK_7577
13@ = 0
15@ = 0
return 

:PNSRWK_422
gosub @PNSRWK_6431
if 
  22@ == 0
goto_if_false @PNSRWK_562
if 
  is_int_lvar_equal_to_int_lvar 13@ == 27@
goto_if_false @PNSRWK_468
return 

:PNSRWK_468
set_lvar_int_to_lvar_int 13@ = 27@
21@ = 40
gosub @PNSRWK_7967
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "~r~Pay 'n' Spray closed.~n~Opens at %d:00." {args} 22@ 
gosub @PNSRWK_8027
return 

:PNSRWK_562
22@ = read_memory 9879560 {size} 1 {vp} False
if 
  22@ == 0
goto_if_false @PNSRWK_1005
16@, 17@, 18@ = get_char_coordinates $PLAYER_ACTOR
if 
  950.0 > 18@
goto_if_false @PNSRWK_1005
set_lvar_int_to_lvar_int 21@ = 27@
21@ += 77
22@ = read_memory 21@ {size} 1 {vp} False
if 
  22@ == 1
goto_if_false @PNSRWK_1005
call_method_return 4492880 {struct} 27@ {numArgs} 1 {pop} 0 {args} 0.0 {var_funcRet} 22@ 
22@ = 255 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_970
if 
  is_int_lvar_equal_to_int_lvar 15@ == 27@
goto_if_false @PNSRWK_752
goto @PNSRWK_857

:PNSRWK_752
set_lvar_int_to_lvar_int 15@ = 27@
31@ = 0
22@ = store_wanted_level $PLAYER_CHAR
if 
  22@ > 0
goto_if_false @PNSRWK_857
21@ = 24
gosub @PNSRWK_7967
if 
  22@ == 1
goto_if_false @PNSRWK_857
gosub @PNSRWK_7105
if 
  22@ == 1
goto_if_false @PNSRWK_857
31@ = 16

:PNSRWK_857
set_lvar_int_to_lvar_int 22@ = 31@
22@ = 16 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_908
set_lvar_int_to_lvar_int 21@ = 27@
gosub @PNSRWK_7312

:PNSRWK_908
call_method_return 4499504 {struct} 27@ {numArgs} 0 {pop} 0 {args} 22@ {var_funcRet} 
22@ = 255 & 22@
if 
  22@ == 1
goto_if_false @PNSRWK_1003
set_lvar_int_to_lvar_int 6@ = 27@
goto @PNSRWK_1014

:PNSRWK_970
if 
  is_int_lvar_equal_to_int_lvar 14@ == 27@
goto_if_false @PNSRWK_996
gosub @PNSRWK_7577

:PNSRWK_996
15@ = 0

:PNSRWK_1003
return 

:PNSRWK_1005
gosub @PNSRWK_7577
return 

:PNSRWK_1014
set_lvar_int_to_lvar_int 22@ = 31@
22@ = 16 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_1448
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1428
22@ = read_memory 21@ {size} 1 {vp} False
if 
  22@ == 10
goto_if_false @PNSRWK_1161
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "~r~I don't do toys!"
gosub @PNSRWK_8027
22@ = 15
gosub @PNSRWK_7766
goto @PNSRWK_1535

:PNSRWK_1161
call_function_return 4487584 {numArgs} 1 {pop} 1 {args} 9@ {var_funcRet} 22@ 
22@ = 255 & 22@
if 
  22@ == 1
goto_if_false @PNSRWK_1362
gosub @PNSRWK_5250
if 
  10@ > 0
goto_if_false @PNSRWK_1544
22@ = store_score $PLAYER_CHAR
if 
  is_int_lvar_greater_than_int_lvar 10@ > 22@
goto_if_false @PNSRWK_1544
set_lvar_int_to_lvar_int 23@ = 10@
sub_int_lvar_from_int_lvar 23@ -= 22@
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "~r~That's $%d.~n~You're $%d short!" {args} 10@ 23@ 
gosub @PNSRWK_8027
22@ = 14
gosub @PNSRWK_7766
goto @PNSRWK_1535

:PNSRWK_1362
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "~r~Whoa! I don't touch nothing THAT hot!"
gosub @PNSRWK_8027
22@ = 15
gosub @PNSRWK_7766
goto @PNSRWK_1535

:PNSRWK_1448
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "~r~The cops saw you drive in!~n~Lose them first."
gosub @PNSRWK_8027
22@ = 15
gosub @PNSRWK_7766

:PNSRWK_1535
7@ = 4
return 

:PNSRWK_1544
12@ = store_wanted_level $PLAYER_CHAR
21@ = 16
gosub @PNSRWK_7967
set_lvar_int_to_lvar_int 27@ = 22@
set_lvar_int_to_lvar_int 22@ = 31@
22@ = 64 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_1617
goto @PNSRWK_1647

:PNSRWK_1617
21@ = 48
gosub @PNSRWK_7967
mult_int_lvar_by_int_lvar 22@ *= 12@
add_int_lvar_to_int_lvar 27@ += 22@

:PNSRWK_1647
21@ = 52
set_lvar_int_to_lvar_int 22@ = 27@
gosub @PNSRWK_7997
gosub @PNSRWK_7685
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1070
22@ = read_memory 21@ {size} 1 {vp} False
22@ = 128 | 22@
write_memory 21@ {size} 1 {value} 22@ {vp} False
gosub @PNSRWK_5136
set_lvar_int_to_lvar_int 21@ = 6@
21@ += 77
write_memory 21@ {size} 1 {value} 2 {vp} False
7@ = 1
return 

:PNSRWK_1769
gosub @PNSRWK_2685
if 
  22@ == 1
goto_if_false @PNSRWK_2676
9@ = get_vehicle_pointer 8@
call_method 4493856 {struct} 6@ {numArgs} 1 {pop} 0 {args} 9@ 
set_lvar_int_to_lvar_int 21@ = 6@
gosub @PNSRWK_7312
set_lvar_int_to_lvar_int 21@ = 6@
21@ += 77
22@ = read_memory 21@ {size} 1 {vp} False
if 
  22@ == 0
goto_if_false @PNSRWK_2145
22@ = 16
gosub @PNSRWK_7766
22@ = read_memory 12030176 {size} 4 {vp} False
cset_lvar_float_to_lvar_int 16@ =# 22@
call_function 5620096 {numArgs} 2 {pop} 2 {args} 16@ 177 
call_function 5611632 {numArgs} 2 {pop} 2 {args} 0.0 176 
21@ = 32
gosub @PNSRWK_7967
if 
  22@ == 1
goto_if_false @PNSRWK_2043
16@ = get_car_heading 8@
16@ += 180.0
if 
  16@ >= 360.0
goto_if_false @PNSRWK_2035
16@ -= 360.0

:PNSRWK_2035
set_car_heading 8@ {heading} 16@

:PNSRWK_2043
21@ = 52
gosub @PNSRWK_7967
if 
  22@ > 0
goto_if_false @PNSRWK_2124
21@ = 20
gosub @PNSRWK_7967
if 
  22@ == 1
goto_if_false @PNSRWK_2124
do_fade 500 {direction} Fade.Out
31@ = 32 | 31@

:PNSRWK_2124
11@ = read_memory 12045188 {size} 4 {vp} False
7@ = 2

:PNSRWK_2145
return 

:PNSRWK_2147
gosub @PNSRWK_2685
if 
  22@ == 1
goto_if_false @PNSRWK_2676
set_lvar_int_to_lvar_int 21@ = 6@
gosub @PNSRWK_7312
22@ = read_memory 12045188 {size} 4 {vp} False
sub_int_lvar_from_int_lvar 22@ -= 11@
set_lvar_int_to_lvar_int 23@ = 31@
23@ = 32 & 23@
if 
  23@ == 0
goto_if_false @PNSRWK_2271
if 
  22@ >= 2000
goto_if_false @PNSRWK_2402
goto @PNSRWK_2305

:PNSRWK_2271
if 
  get_fading_status 
goto_if_false @PNSRWK_2286
return 

:PNSRWK_2286
if 
  22@ >= 1500
goto_if_false @PNSRWK_2402

:PNSRWK_2305
gosub @PNSRWK_2998
gosub @PNSRWK_7798
set_lvar_int_to_lvar_int 23@ = 31@
23@ = 32 & 23@
if 
  23@ == 0
goto_if_false @PNSRWK_2362
goto @PNSRWK_2369

:PNSRWK_2362
do_fade 500 {direction} Fade.In

:PNSRWK_2369
set_lvar_int_to_lvar_int 21@ = 6@
21@ += 77
write_memory 21@ {size} 1 {value} 3 {vp} False
7@ = 3

:PNSRWK_2402
return 

:PNSRWK_2404
set_lvar_int_to_lvar_int 21@ = 6@
21@ += 56
16@ = read_memory 21@ {size} 4 {vp} False
set_lvar_int_to_lvar_int 21@ = 6@
21@ += 77
22@ = read_memory 21@ {size} 1 {vp} False
if or
  16@ > 0.5
  22@ == 1
goto_if_false @PNSRWK_2507
gosub @PNSRWK_7725
gosub @PNSRWK_7577
7@ = 4

:PNSRWK_2507
return 

:PNSRWK_2509
if 
  6@ == 0
goto_if_false @PNSRWK_2534
goto @PNSRWK_2586

:PNSRWK_2534
call_method_return 4492880 {struct} 6@ {numArgs} 1 {pop} 0 {args} 0.0 {var_funcRet} 22@ 
22@ = 255 & 22@
if 
  22@ == 1
goto_if_false @PNSRWK_2623

:PNSRWK_2586
gosub @PNSRWK_7577
6@ = 0
15@ = 0
31@ = 0
7@ = 0
return 

:PNSRWK_2623
set_lvar_int_to_lvar_int 22@ = 31@
22@ = 16 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_2674
set_lvar_int_to_lvar_int 21@ = 6@
gosub @PNSRWK_7312

:PNSRWK_2674
return 

:PNSRWK_2676
gosub @PNSRWK_2760
return 

:PNSRWK_2685
22@ = 0
if 
  is_char_in_any_car $PLAYER_ACTOR
goto_if_false @PNSRWK_2758
23@ = store_car_char_is_in_no_save $PLAYER_ACTOR
if 
  is_int_lvar_equal_to_int_lvar 23@ == 8@
goto_if_false @PNSRWK_2758
if 
  not is_car_dead 8@
goto_if_false @PNSRWK_2758
22@ = 1

:PNSRWK_2758
return 

:PNSRWK_2760
if 
  7@ == 0
goto_if_false @PNSRWK_2785
goto @PNSRWK_2968

:PNSRWK_2785
if or
  7@ == 1
  7@ == 2
  7@ == 3
goto_if_false @PNSRWK_2873
gosub @PNSRWK_7725
set_lvar_int_to_lvar_int 22@ = 31@
22@ = 32 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_2867
goto @PNSRWK_2873

:PNSRWK_2867
do_fade 0 {direction} Fade.In

:PNSRWK_2873
if 
  6@ == 0
goto_if_false @PNSRWK_2898
goto @PNSRWK_2961

:PNSRWK_2898
set_lvar_int_to_lvar_int 21@ = 6@
21@ += 77
22@ = read_memory 21@ {size} 1 {vp} False
if or
  22@ == 0
  22@ == 2
goto_if_false @PNSRWK_2961
write_memory 21@ {size} 1 {value} 3 {vp} False

:PNSRWK_2961
gosub @PNSRWK_7577

:PNSRWK_2968
6@ = 0
15@ = 0
31@ = 0
7@ = 0
return 

:PNSRWK_2998
9@ = get_vehicle_pointer 8@
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1424
23@ = read_memory 21@ {size} 4 {vp} False
if or
  23@ == 0
  23@ == 9
goto_if_false @PNSRWK_3439
21@ = read_memory 9@ {size} 4 {vp} False
21@ += 200
21@ = read_memory 21@ {size} 4 {vp} False
call_method 21@ {struct} 9@ {numArgs} 0 {pop} 0
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1216
16@ = read_memory 21@ {size} 4 {vp} False
if 
  1000.0 > 16@
goto_if_false @PNSRWK_3175
16@ = 1000.0
write_memory 21@ {size} 4 {value} 16@ {vp} False

:PNSRWK_3175
gosub @PNSRWK_5136
call_function 5620096 {numArgs} 2 {pop} 2 {args} 1.0 138 
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 20
21@ = read_memory 21@ {size} 4 {vp} False
if 
  21@ == 0
goto_if_false @PNSRWK_3254
goto @PNSRWK_3309

:PNSRWK_3254
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
16@ = read_memory 22@ {size} 4 {vp} False
if 
  0.0 > 16@
goto_if_false @PNSRWK_3309
gosub @PNSRWK_4973

:PNSRWK_3309
set_lvar_int_to_lvar_int 22@ = 31@
22@ = 1 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_3352
goto @PNSRWK_3359

:PNSRWK_3352
gosub @PNSRWK_4646

:PNSRWK_3359
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1200
write_memory 21@ {size} 4 {value} 0.0 {vp} False
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1070
22@ = read_memory 21@ {size} 1 {vp} False
22@ = 127 & 22@
write_memory 21@ {size} 1 {value} 22@ {vp} False

:PNSRWK_3439
set_lvar_int_to_lvar_int 22@ = 31@
22@ = 2 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_3482
goto @PNSRWK_3487

:PNSRWK_3482
clear_wanted_level $PLAYER_CHAR

:PNSRWK_3487
if 
  10@ > 0
goto_if_false @PNSRWK_3553
22@ = 0
sub_int_lvar_from_int_lvar 22@ -= 10@
add_score $PLAYER_CHAR {money} 22@
cset_lvar_float_to_lvar_int 16@ =# 10@
call_function 5620096 {numArgs} 2 {pop} 2 {args} 16@ 16 

:PNSRWK_3553
set_lvar_int_to_lvar_int 21@ = 6@
21@ += 78
22@ = read_memory 21@ {size} 1 {vp} False
22@ = 4 | 22@
write_memory 21@ {size} 1 {value} 22@ {vp} False
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1071
22@ = read_memory 21@ {size} 1 {vp} False
22@ = 1 | 22@
write_memory 21@ {size} 1 {value} 22@ {vp} False
gosub @PNSRWK_3661
return 

:PNSRWK_3661
set_lvar_int_to_lvar_int 21@ = 6@
21@ += 78
22@ = read_memory 21@ {size} 1 {vp} False
22@ = 128 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_4375
set_lvar_int_to_lvar_int 22@ = 31@
22@ = 64 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_4441
set_lvar_int_to_lvar_int 22@ = 31@
22@ = 2 & 22@
if and
  12@ > 0
  22@ == 0
goto_if_false @PNSRWK_3883
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "Repairs: $%d~n~~r~Custom paint: cops still know this car!" {args} 10@ 
gosub @PNSRWK_8027
return 

:PNSRWK_3883
if 
  10@ > 0
goto_if_false @PNSRWK_4243
set_lvar_int_to_lvar_int 23@ = 31@
23@ = 4 & 23@
if 
  22@ == 0
goto_if_false @PNSRWK_4062
if 
  23@ == 0
goto_if_false @PNSRWK_4003
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "New paint job: $%d" {args} 10@ 
gosub @PNSRWK_8027
return 

:PNSRWK_4003
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "New engine and paint job: $%d" {args} 10@ 
gosub @PNSRWK_8027
return 

:PNSRWK_4062
if 
  23@ == 0
goto_if_false @PNSRWK_4156
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "New paint job: $%d~n~Cops won't recognize you!" {args} 10@ 
gosub @PNSRWK_8027
return 

:PNSRWK_4156
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "New engine and paint job: $%d~n~Cops won't recognize you!" {args} 10@ 
gosub @PNSRWK_8027
return 

:PNSRWK_4243
22@ = generate_random_int_in_range 0 {max} 2
if 
  22@ == 0
goto_if_false @PNSRWK_4324
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "Hope you like the new color"
gosub @PNSRWK_8027
return 

:PNSRWK_4324
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "Respray is complementary"
gosub @PNSRWK_8027
return 

:PNSRWK_4375
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "Your girlfriend has fixed your vehicle."
gosub @PNSRWK_8027
return 

:PNSRWK_4441
21@ = 52
gosub @PNSRWK_7967
if 
  10@ > 0
goto_if_false @PNSRWK_4563
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "Laid low here for %d hours: $%d~n~Cops lost track of you." {args} 22@ 10@ 
gosub @PNSRWK_8027
return 

:PNSRWK_4563
21@ = get_label_pointer @PNSRWK_13320
string_format 21@ {format} "Laid low here for %d hours.~n~Cops lost track of you." {args} 22@ 
gosub @PNSRWK_8027
return 

:PNSRWK_4646
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 34
22@ = read_memory 21@ {size} 2 {vp} False
22@ *= 4
22@ += 11120840
22@ = read_memory 22@ {size} 4 {vp} False
if 
  22@ == 0
goto_if_false @PNSRWK_4722
return 

:PNSRWK_4722
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1076
27@ = read_memory 21@ {size} 4 {vp} False
23@ = get_label_pointer @PNSRWK_13448
set_lvar_int_to_lvar_int 13@ = 23@
13@ += 1
set_lvar_int_to_lvar_int 15@ = 23@
15@ += 2
set_lvar_int_to_lvar_int 30@ = 23@
30@ += 3
11@ = 0

:PNSRWK_4812
call_method 5014784 {struct} 22@ {numArgs} 5 {pop} 0 {args} 1 30@ 15@ 13@ 23@ 
21@ = read_memory 23@ {size} 4 {vp} False
11@ += 1
if 
  is_int_lvar_equal_to_int_lvar 21@ == 27@
goto_if_false @PNSRWK_4904
if 
  8 > 11@
goto_if_false @PNSRWK_4904
goto @PNSRWK_4812

:PNSRWK_4904
13@ = 0
set_lvar_int_to_lvar_int 15@ = 6@
30@ = 0
set_lvar_int_to_lvar_int 22@ = 9@
22@ += 1076
write_memory 22@ {size} 4 {value} 21@ {vp} False
call_method 7146496 {struct} 9@ {numArgs} 1 {pop} 0 {args} -1 
return 

:PNSRWK_4973
set_lvar_int_to_lvar_int 22@ = 21@
gosub @PNSRWK_5100
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 4
gosub @PNSRWK_5100
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 8
gosub @PNSRWK_5100
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 32
gosub @PNSRWK_5100
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 36
gosub @PNSRWK_5100
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
gosub @PNSRWK_5100
return 

:PNSRWK_5100
16@ = read_memory 22@ {size} 4 {vp} False
16@ *= -1.0
write_memory 22@ {size} 4 {value} 16@ {vp} False
return 

:PNSRWK_5136
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1424
22@ = read_memory 21@ {size} 4 {vp} False
set_lvar_int_to_lvar_int 21@ = 9@
if 
  22@ == 0
goto_if_false @PNSRWK_5211
21@ += 2276
write_memory 21@ {size} 4 {value} 0 {vp} False
return 

:PNSRWK_5211
if 
  22@ == 9
goto_if_false @PNSRWK_5248
21@ += 1980
write_memory 21@ {size} 4 {value} 0 {vp} False

:PNSRWK_5248
return 

:PNSRWK_5250
10@ = 0
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 2152
22@ = read_memory 21@ {size} 1 {vp} False
22@ = 2 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_5381
call_method_return 7146352 {struct} 9@ {numArgs} 0 {pop} 0 {args} 22@ {var_funcRet} 
if 
  0 > 22@
goto_if_false @PNSRWK_5381
31@ = 1 | 31@
21@ = 0
gosub @PNSRWK_7967
add_int_lvar_to_int_lvar 10@ += 22@

:PNSRWK_5381
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1424
23@ = read_memory 21@ {size} 4 {vp} False
if or
  23@ == 0
  23@ == 9
goto_if_false @PNSRWK_5659
set_lvar_int_to_lvar_int 21@ = 9@
21@ += 1216
16@ = read_memory 21@ {size} 4 {vp} False
21@ = 12
gosub @PNSRWK_7967
cset_lvar_float_to_lvar_int 17@ =# 22@
if 
  is_float_lvar_greater_than_float_lvar 17@ > 16@
goto_if_false @PNSRWK_5659
31@ = 4 | 31@
if 
  0.0 > 16@
goto_if_false @PNSRWK_5544
16@ = 0.0

:PNSRWK_5544
17@ = 1000.0
sub_float_lvar_from_float_lvar 17@ -= 16@
if 
  0.0 > 17@
goto_if_false @PNSRWK_5593
17@ = 0.0

:PNSRWK_5593
17@ /= 1000.0
21@ = 8
gosub @PNSRWK_7967
cset_lvar_float_to_lvar_int 18@ =# 22@
mult_float_lvar_by_float_lvar 18@ *= 17@
18@ += 0.5
cset_lvar_int_to_lvar_float 22@ =# 18@
add_int_lvar_to_int_lvar 10@ += 22@

:PNSRWK_5659
23@ = store_wanted_level $PLAYER_CHAR
if 
  23@ > 0
goto_if_false @PNSRWK_5828
set_lvar_int_to_lvar_int 22@ = 31@
22@ = 1 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_5788
21@ = 36
gosub @PNSRWK_7967
if 
  22@ == 1
goto_if_false @PNSRWK_5760
goto @PNSRWK_5828

:PNSRWK_5760
if 
  22@ == 2
goto_if_false @PNSRWK_5788
31@ = 64 | 31@

:PNSRWK_5788
31@ = 2 | 31@
21@ = 4
gosub @PNSRWK_7967
mult_int_lvar_by_int_lvar 22@ *= 23@
add_int_lvar_to_int_lvar 10@ += 22@

:PNSRWK_5828
22@ = read_memory 9879561 {size} 1 {vp} False
if 
  22@ == 0
goto_if_false @PNSRWK_5944
set_lvar_int_to_lvar_int 21@ = 6@
if 
  21@ == 0
goto_if_false @PNSRWK_5894
set_lvar_int_to_lvar_int 21@ = 27@

:PNSRWK_5894
21@ += 78
22@ = read_memory 21@ {size} 1 {vp} False
22@ = 128 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_5944
return 

:PNSRWK_5944
10@ = 0
31@ = 8 | 31@
return 

:PNSRWK_5963
27@ = 0
26@ = 225.0
16@, 17@, 18@ = get_char_coordinates $PLAYER_ACTOR
23@ = read_memory 9879588 {size} 4 {vp} False
21@ = 9879624

:PNSRWK_6018
if 
  23@ > 0
goto_if_false @PNSRWK_6165
23@ -= 1
gosub @PNSRWK_6167
if 
  22@ == 1
goto_if_false @PNSRWK_6150
gosub @PNSRWK_6285
sub_float_lvar_from_float_lvar 19@ -= 16@
sub_float_lvar_from_float_lvar 20@ -= 17@
mult_float_lvar_by_float_lvar 19@ *= 19@
mult_float_lvar_by_float_lvar 20@ *= 20@
add_float_lvar_to_float_lvar 19@ += 20@
if 
  is_float_lvar_greater_than_float_lvar 26@ > 19@
goto_if_false @PNSRWK_6150
set_lvar_float_to_lvar_float 26@ = 19@
set_lvar_int_to_lvar_int 27@ = 21@

:PNSRWK_6150
21@ += 216
goto @PNSRWK_6018

:PNSRWK_6165
return 

:PNSRWK_6167
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 76
22@ = read_memory 22@ {size} 1 {vp} False
if 
  22@ == 5
goto_if_false @PNSRWK_6276
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 78
22@ = read_memory 22@ {size} 1 {vp} False
22@ = 2 & 22@
if 
  22@ == 0
goto_if_false @PNSRWK_6276
22@ = 1
return 

:PNSRWK_6276
22@ = 0
return 

:PNSRWK_6285
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
19@ = read_memory 22@ {size} 4 {vp} False
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 44
24@ = read_memory 22@ {size} 4 {vp} False
add_float_lvar_to_float_lvar 19@ += 24@
19@ *= 0.5
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 48
20@ = read_memory 22@ {size} 4 {vp} False
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 52
25@ = read_memory 22@ {size} 4 {vp} False
add_float_lvar_to_float_lvar 20@ += 25@
20@ *= 0.5
return 

:PNSRWK_6431
23@ = read_memory 11993427 {size} 1 {vp} False
set_lvar_int_to_lvar_int 22@ = 28@
22@ += 40
22@ = read_memory 22@ {size} 4 {vp} False
set_lvar_int_to_lvar_int 21@ = 28@
21@ += 44
21@ = read_memory 21@ {size} 4 {vp} False
if 
  is_int_lvar_equal_to_int_lvar 22@ == 21@
goto_if_false @PNSRWK_6525
goto @PNSRWK_6605

:PNSRWK_6525
if 
  is_int_lvar_greater_than_int_lvar 21@ > 22@
goto_if_false @PNSRWK_6578
if and
  is_int_lvar_greater_or_equal_to_int_lvar 23@ >= 22@
  is_int_lvar_greater_than_int_lvar 21@ > 23@
goto_if_false @PNSRWK_6614
goto @PNSRWK_6605

:PNSRWK_6578
if or
  is_int_lvar_greater_or_equal_to_int_lvar 23@ >= 22@
  is_int_lvar_greater_than_int_lvar 21@ > 23@
goto_if_false @PNSRWK_6614

:PNSRWK_6605
22@ = 1
return 

:PNSRWK_6614
22@ = 0
return 

:PNSRWK_6623
22@ = read_memory 12045188 {size} 4 {vp} False
set_lvar_int_to_lvar_int 23@ = 22@
sub_int_lvar_from_int_lvar 23@ -= 30@
if or
  23@ >= 1000
  0 > 23@
goto_if_false @PNSRWK_7047
set_lvar_int_to_lvar_int 30@ = 22@
gosub @PNSRWK_6431
set_lvar_int_to_lvar_int 27@ = 22@
23@ = read_memory 9879588 {size} 4 {vp} False
21@ = 9879624

:PNSRWK_6726
if 
  23@ > 0
goto_if_false @PNSRWK_7047
23@ -= 1
gosub @PNSRWK_6167
if 
  22@ == 1
goto_if_false @PNSRWK_7032
if 
  is_int_lvar_equal_to_int_lvar 21@ == 6@
goto_if_false @PNSRWK_6813
if 
  7@ == 0
goto_if_false @PNSRWK_7032

:PNSRWK_6813
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 77
22@ = read_memory 22@ {size} 1 {vp} False
if 
  22@ == 4
goto_if_false @PNSRWK_6872
gosub @PNSRWK_7077
22@ = 1

:PNSRWK_6872
if 
  27@ == 1
goto_if_false @PNSRWK_6929
if or
  22@ == 0
  22@ == 2
goto_if_false @PNSRWK_7032
gosub @PNSRWK_7049
goto @PNSRWK_7032

:PNSRWK_6929
if or
  22@ == 1
  22@ == 3
goto_if_false @PNSRWK_7032
call_method_return 4492880 {struct} 21@ {numArgs} 1 {pop} 0 {args} 0.0 {var_funcRet} 22@ 
22@ = 255 & 22@
if 
  22@ == 1
goto_if_false @PNSRWK_7032
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 77
write_memory 22@ {size} 1 {value} 2 {vp} False

:PNSRWK_7032
21@ += 216
goto @PNSRWK_6726

:PNSRWK_7047
return 

:PNSRWK_7049
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 77
write_memory 22@ {size} 1 {value} 3 {vp} False
return 

:PNSRWK_7077
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 77
write_memory 22@ {size} 1 {value} 1 {vp} False
return 

:PNSRWK_7105
16@, 17@, 18@ = get_char_coordinates $PLAYER_ACTOR
18@ += 0.5
set_lvar_int_to_lvar_int 23@ = 28@
23@ += 28
26@ = read_memory 23@ {size} 4 {vp} False
21@ = 0

:PNSRWK_7163
if 
  23@ = get_random_char_in_sphere_no_save_recursive 16@ {y} 17@ {z} 18@ {radius} 26@ {findNext} 21@ {filter} CharSearchFilter.AnyAliveNPC
goto_if_false @PNSRWK_7303
21@ = 1
22@ = get_ped_type 23@
if 
  22@ == 6
goto_if_false @PNSRWK_7163
19@, 20@, 24@ = get_char_coordinates 23@
24@ += 0.6
if 
  is_line_of_sight_clear 19@ {fromY} 20@ {fromZ} 24@ {toX} 16@ {toY} 17@ {toZ} 18@ {buildings} True {cars} False {chars} False {objects} True {particles} False
goto_if_false @PNSRWK_7163
22@ = 1
return 

:PNSRWK_7303
22@ = 0
return 

:PNSRWK_7312
call_function_return 5694000 {numArgs} 1 {pop} 1 {args} -1 {var_funcRet} 22@ 
if 
  22@ == 0
goto_if_false @PNSRWK_7354
goto @PNSRWK_7395

:PNSRWK_7354
22@ += 30
23@ = read_memory 22@ {size} 1 {vp} False
23@ = 2 | 23@
write_memory 22@ {size} 1 {value} 23@ {vp} False

:PNSRWK_7395
set_lvar_int_to_lvar_int 14@ = 21@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
16@ = read_memory 22@ {size} 4 {vp} False
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 44
17@ = read_memory 22@ {size} 4 {vp} False
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 48
18@ = read_memory 22@ {size} 4 {vp} False
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 52
19@ = read_memory 22@ {size} 4 {vp} False
16@ -= 10.0
18@ -= 10.0
17@ += 10.0
19@ += 10.0
call_function 5663328 {numArgs} 4 {pop} 4 {args} 19@ 17@ 18@ 16@ 
return 

:PNSRWK_7577
if 
  14@ == 0
goto_if_false @PNSRWK_7597
return 

:PNSRWK_7597
14@ = 0
call_function_return 5694000 {numArgs} 1 {pop} 1 {args} -1 {var_funcRet} 22@ 
if 
  22@ == 0
goto_if_false @PNSRWK_7641
return 

:PNSRWK_7641
22@ += 30
23@ = read_memory 22@ {size} 1 {vp} False
23@ = 253 & 23@
write_memory 22@ {size} 1 {value} 23@ {vp} False
return 

:PNSRWK_7685
22@ = read_memory 12006758 {size} 1 {vp} False
22@ = 4 | 22@
write_memory 12006758 {size} 1 {value} 22@ {vp} False
return 

:PNSRWK_7725
22@ = read_memory 12006758 {size} 1 {vp} False
22@ = 251 & 22@
write_memory 12006758 {size} 1 {value} 22@ {vp} False
return 

:PNSRWK_7766
call_method 5271200 {struct} 11975824 {numArgs} 3 {pop} 0 {args} 1.0 0.0 22@ 
return 

:PNSRWK_7798
21@ = 52
gosub @PNSRWK_7967
if 
  22@ > 0
goto_if_false @PNSRWK_7965
23@ = read_memory 11993427 {size} 1 {vp} False
21@ = read_memory 11993426 {size} 1 {vp} False
27@ = read_memory 11993422 {size} 1 {vp} False
add_int_lvar_to_int_lvar 23@ += 22@

:PNSRWK_7880
if 
  23@ >= 24
goto_if_false @PNSRWK_7944
23@ -= 24
27@ += 1
if 
  27@ > 7
goto_if_false @PNSRWK_7880
27@ = 1
goto @PNSRWK_7880

:PNSRWK_7944
call_function 5427536 {numArgs} 3 {pop} 3 {args} 27@ 21@ 23@ 

:PNSRWK_7965
return 

:PNSRWK_7967
set_lvar_int_to_lvar_int 22@ = 28@
add_int_lvar_to_int_lvar 22@ += 21@
22@ = read_memory 22@ {size} 4 {vp} False
return 

:PNSRWK_7997
set_lvar_int_to_lvar_int 23@ = 28@
add_int_lvar_to_int_lvar 23@ += 21@
write_memory 23@ {size} 4 {value} 22@ {vp} False
return 

:PNSRWK_8027
21@ = 72
gosub @PNSRWK_7967
if 
  22@ == 1
goto_if_false @PNSRWK_8156
21@ = get_label_pointer @PNSRWK_13320
add_text_label 'PNSMSG' {text} 21@
23@ = read_memory 12045188 {size} 4 {vp} False
21@ = 104
gosub @PNSRWK_7967
add_int_lvar_to_int_lvar 22@ += 23@
21@ = 64
gosub @PNSRWK_7997
21@ = 68
22@ = 1
gosub @PNSRWK_7997
return 

:PNSRWK_8156
21@ = get_label_pointer @PNSRWK_13320
print_formatted_now "%s" {time} 4000 {args} 21@ 
return 

:PNSRWK_8181
21@ = 68
gosub @PNSRWK_7967
if 
  22@ == 1
goto_if_false @PNSRWK_8580
23@ = read_memory 12045188 {size} 4 {vp} False
21@ = 64
gosub @PNSRWK_7967
if 
  is_int_lvar_greater_than_int_lvar 23@ > 22@
goto_if_false @PNSRWK_8283
21@ = 68
22@ = 0
gosub @PNSRWK_7997
return 

:PNSRWK_8283
21@ = 76
gosub @PNSRWK_7967
cset_lvar_float_to_lvar_int 16@ =# 22@
16@ /= 100.0
17@ = 0.8
mult_float_lvar_by_float_lvar 17@ *= 16@
18@ = 1.7
mult_float_lvar_by_float_lvar 18@ *= 16@
set_lvar_int_to_lvar_int 22@ = 28@
22@ += 80
19@ = read_memory 22@ {size} 4 {vp} False
set_lvar_int_to_lvar_int 22@ = 28@
22@ += 84
20@ = read_memory 22@ {size} 4 {vp} False
use_text_commands True
set_text_right_justify False
set_text_justify False
set_text_wrapx 640.0
set_text_proportional True
set_text_background False
set_text_scale 17@ {heightScale} 18@
set_text_centre True
21@ = 88
gosub @PNSRWK_7967
set_text_font 22@
21@ = 108
gosub @PNSRWK_7967
set_text_edge 22@ {red} 0 {green} 0 {blue} 0 {alpha} 255
21@ = 92
gosub @PNSRWK_7967
set_lvar_int_to_lvar_int 27@ = 22@
21@ = 96
gosub @PNSRWK_7967
set_lvar_int_to_lvar_int 23@ = 22@
21@ = 100
gosub @PNSRWK_7967
set_text_colour 27@ {green} 23@ {blue} 22@ {alpha} 255
display_text 19@ {offsetTop} 20@ {key} 'PNSMSG'

:PNSRWK_8580
return 

:PNSRWK_8582
21@ = 56
gosub @PNSRWK_7967
if 
  22@ == 0
goto_if_false @PNSRWK_8621
goto @PNSRWK_8647

:PNSRWK_8621
remove_blip 22@
22@ = 0
21@ = 56
gosub @PNSRWK_7997

:PNSRWK_8647
if 
  0@ == 1
goto_if_false @PNSRWK_8919
if 
  5@ == 1
goto_if_false @PNSRWK_8919
21@ = 60
gosub @PNSRWK_7967
if 
  22@ == 1
goto_if_false @PNSRWK_8919
23@ = read_memory 9879588 {size} 4 {vp} False
21@ = 9879624

:PNSRWK_8739
if 
  23@ > 0
goto_if_false @PNSRWK_8919
23@ -= 1
gosub @PNSRWK_6167
if 
  22@ == 1
goto_if_false @PNSRWK_8904
gosub @PNSRWK_6285
19@ -= 2393.8999
20@ -= 1490.5
mult_float_lvar_by_float_lvar 19@ *= 19@
mult_float_lvar_by_float_lvar 20@ *= 20@
add_float_lvar_to_float_lvar 19@ += 20@
if 
  100.0 > 19@
goto_if_false @PNSRWK_8904
22@ = add_short_range_sprite_blip_for_coord 2393.8999 {y} 1490.5 {z} 10.8 {sprite} RadarSprite.Spray
21@ = 56
gosub @PNSRWK_7997
goto @PNSRWK_8919

:PNSRWK_8904
21@ += 216
goto @PNSRWK_8739

:PNSRWK_8919
return 

:PNSRWK_8921
gosub @PNSRWK_9419
if 
  0@ == 1
goto_if_false @PNSRWK_9305
if 
  27@ == 2
goto_if_false @PNSRWK_8973
5@ = 2
return 

:PNSRWK_8973
if 
  27@ == 1
goto_if_false @PNSRWK_9006
set_lvar_int_to_lvar_int 4@ = 21@
goto @PNSRWK_9058

:PNSRWK_9006
if 
  4@ == 0
goto_if_false @PNSRWK_9058
gosub @PNSRWK_9825
if 
  4@ == 0
goto_if_false @PNSRWK_9058
5@ = 0
return 

:PNSRWK_9058
write_memory 4@ {size} 4 {value} 1381191248 {vp} False
21@ = get_label_pointer @PNSRWK_13137
set_lvar_int_to_lvar_int 22@ = 4@
22@ += 16
23@ = 55

:PNSRWK_9104
27@ = read_memory 21@ {size} 1 {vp} False
write_memory 22@ {size} 1 {value} 27@ {vp} False
21@ += 1
22@ += 1
23@ -= 1
if 
  23@ > 0
goto_if_false @PNSRWK_9174
goto @PNSRWK_9104

:PNSRWK_9174
set_lvar_int_to_lvar_int 21@ = 4@
21@ += 16
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 7
set_lvar_int_to_lvar_int 23@ = 21@
23@ += 31
write_memory 4507708 {size} 4 {value} 21@ {vp} True
write_memory 4507712 {size} 4 {value} 21@ {vp} True
write_memory 4507716 {size} 4 {value} 22@ {vp} True
write_memory 4507720 {size} 4 {value} 23@ {vp} True
write_memory 4507724 {size} 4 {value} 21@ {vp} True
5@ = 1
30@ = 0
return 

:PNSRWK_9305
5@ = 0
if 
  27@ == 1
goto_if_false @PNSRWK_9417
gosub @PNSRWK_9671
write_memory 4507708 {size} 4 {value} 4501184 {vp} True
write_memory 4507712 {size} 4 {value} 4500560 {vp} True
write_memory 4507716 {size} 4 {value} 4501004 {vp} True
write_memory 4507720 {size} 4 {value} 4503452 {vp} True
write_memory 4507724 {size} 4 {value} 4502540 {vp} True

:PNSRWK_9417
return 

:PNSRWK_9419
27@ = 2
22@ = read_memory 4507708 {size} 4 {vp} True
23@ = read_memory 4507716 {size} 4 {vp} True
if and
  22@ == 4501184
  23@ == 4501004
goto_if_false @PNSRWK_9588
22@ = read_memory 4507712 {size} 4 {vp} True
23@ = read_memory 4507720 {size} 4 {vp} True
if and
  22@ == 4500560
  23@ == 4503452
goto_if_false @PNSRWK_9669
22@ = read_memory 4507724 {size} 4 {vp} True
if 
  22@ == 4502540
goto_if_false @PNSRWK_9669
27@ = 0
return 

:PNSRWK_9588
set_lvar_int_to_lvar_int 21@ = 22@
21@ -= 16
22@ += 7
if 
  is_int_lvar_equal_to_int_lvar 22@ == 23@
goto_if_false @PNSRWK_9669
22@ = read_memory 21@ {size} 4 {vp} False
if 
  22@ == 1381191248
goto_if_false @PNSRWK_9669
27@ = 1

:PNSRWK_9669
return 

:PNSRWK_9671
23@ = read_memory 9879588 {size} 4 {vp} False
21@ = 9879624

:PNSRWK_9695
if 
  23@ > 0
goto_if_false @PNSRWK_9823
23@ -= 1
gosub @PNSRWK_6167
if 
  22@ == 1
goto_if_false @PNSRWK_9808
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 77
27@ = read_memory 22@ {size} 1 {vp} False
if or
  27@ == 0
  27@ == 2
goto_if_false @PNSRWK_9808
write_memory 22@ {size} 1 {value} 3 {vp} False

:PNSRWK_9808
21@ += 216
goto @PNSRWK_9695

:PNSRWK_9823
return 

:PNSRWK_9825
if 
  21@ = load_dynamic_library "kernel32.dll"
goto_if_false @PNSRWK_9911
if 
  22@ = get_dynamic_library_procedure "VirtualAlloc" {self} 21@
goto_if_false @PNSRWK_9911
call_function_return 22@ {numArgs} 4 {pop} 0 {args} 64 {var_funcRet} 12288 4096 0 4@ 

:PNSRWK_9911
return 

:PNSRWK_9913
28@ = get_label_pointer @PNSRWK_13192
0@ = 1
1@ = 121
2@ = 1
if 
  22@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "General" {key} "AZ5"
goto_if_false @PNSRWK_10010
set_lvar_int_to_lvar_int 0@ = 22@

:PNSRWK_10010
if 
  22@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "General" {key} "ShowStatus"
goto_if_false @PNSRWK_10083
set_lvar_int_to_lvar_int 2@ = 22@

:PNSRWK_10083
if 
  22@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "General" {key} "ReloadKey"
goto_if_false @PNSRWK_10155
set_lvar_int_to_lvar_int 1@ = 22@

:PNSRWK_10155
21@ = 0
22@ = 100
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Price" {key} "Paint"
goto_if_false @PNSRWK_10235
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_10235
gosub @PNSRWK_12625
21@ = 4
22@ = 50
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Price" {key} "PerStar"
goto_if_false @PNSRWK_10324
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_10324
gosub @PNSRWK_12625
21@ = 8
22@ = 400
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Price" {key} "RepairMax"
goto_if_false @PNSRWK_10416
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_10416
gosub @PNSRWK_12625
21@ = 12
22@ = 970
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Price" {key} "RepairBelow"
goto_if_false @PNSRWK_10510
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_10510
gosub @PNSRWK_12625
21@ = 36
22@ = 2
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Price" {key} "PaintjobStars"
goto_if_false @PNSRWK_10605
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_10605
if 
  22@ > 2
goto_if_false @PNSRWK_10630
22@ = 2

:PNSRWK_10630
gosub @PNSRWK_12625
21@ = 48
22@ = 2
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Price" {key} "HideHoursPerStar"
goto_if_false @PNSRWK_10728
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_10728
if 
  22@ > 8
goto_if_false @PNSRWK_10753
22@ = 8

:PNSRWK_10753
gosub @PNSRWK_12625
21@ = 16
22@ = 2
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Service" {key} "Hours"
goto_if_false @PNSRWK_10842
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_10842
if 
  22@ > 23
goto_if_false @PNSRWK_10867
22@ = 23

:PNSRWK_10867
gosub @PNSRWK_12625
21@ = 20
22@ = 1
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Service" {key} "Fade"
goto_if_false @PNSRWK_10955
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_10955
gosub @PNSRWK_7997
21@ = 32
22@ = 1
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Service" {key} "TurnCar"
goto_if_false @PNSRWK_11046
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_11046
gosub @PNSRWK_7997
21@ = 24
22@ = 1
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Police" {key} "RefuseIfSeen"
goto_if_false @PNSRWK_11141
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_11141
gosub @PNSRWK_7997
16@ = 40.0
if 
  17@ = read_float_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Police" {key} "SeenDistance"
goto_if_false @PNSRWK_11232
set_lvar_float_to_lvar_float 16@ = 17@

:PNSRWK_11232
if 
  5.0 > 16@
goto_if_false @PNSRWK_11263
16@ = 5.0

:PNSRWK_11263
set_lvar_int_to_lvar_int 22@ = 28@
22@ += 28
write_memory 22@ {size} 4 {value} 16@ {vp} False
21@ = 40
22@ = 0
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Hours" {key} "OpenHour"
goto_if_false @PNSRWK_11373
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_11373
gosub @PNSRWK_12657
21@ = 44
22@ = 24
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Hours" {key} "CloseHour"
goto_if_false @PNSRWK_11464
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_11464
gosub @PNSRWK_12657
21@ = 60
22@ = 1
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Map" {key} "LasVenturasEastBlip"
goto_if_false @PNSRWK_11563
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_11563
gosub @PNSRWK_7997
21@ = 72
22@ = 1
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Messages" {key} "Style"
goto_if_false @PNSRWK_11653
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_11653
gosub @PNSRWK_7997
21@ = 76
22@ = 80
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Messages" {key} "Size"
goto_if_false @PNSRWK_11742
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_11742
if 
  22@ > 300
goto_if_false @PNSRWK_11769
22@ = 300

:PNSRWK_11769
if 
  20 > 22@
goto_if_false @PNSRWK_11794
22@ = 20

:PNSRWK_11794
gosub @PNSRWK_7997
16@ = 320.0
if 
  17@ = read_float_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Messages" {key} "X"
goto_if_false @PNSRWK_11876
set_lvar_float_to_lvar_float 16@ = 17@

:PNSRWK_11876
set_lvar_int_to_lvar_int 22@ = 28@
22@ += 80
write_memory 22@ {size} 4 {value} 16@ {vp} False
16@ = 163.0
if 
  17@ = read_float_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Messages" {key} "Y"
goto_if_false @PNSRWK_11978
set_lvar_float_to_lvar_float 16@ = 17@

:PNSRWK_11978
set_lvar_int_to_lvar_int 22@ = 28@
22@ += 84
write_memory 22@ {size} 4 {value} 16@ {vp} False
21@ = 88
22@ = 3
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Messages" {key} "Font"
goto_if_false @PNSRWK_12087
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_12087
gosub @PNSRWK_7997
21@ = 108
22@ = 2
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Messages" {key} "Edge"
goto_if_false @PNSRWK_12176
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_12176
gosub @PNSRWK_7997
21@ = 92
22@ = 235
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Messages" {key} "ColorR"
goto_if_false @PNSRWK_12268
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_12268
gosub @PNSRWK_7997
21@ = 96
22@ = 165
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Messages" {key} "ColorG"
goto_if_false @PNSRWK_12360
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_12360
gosub @PNSRWK_7997
21@ = 100
22@ = 35
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Messages" {key} "ColorB"
goto_if_false @PNSRWK_12451
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_12451
gosub @PNSRWK_7997
21@ = 104
22@ = 4000
if 
  23@ = read_int_from_ini_file "cleo\PaynSprayReworked.ini" {section} "Messages" {key} "Time"
goto_if_false @PNSRWK_12541
set_lvar_int_to_lvar_int 22@ = 23@

:PNSRWK_12541
gosub @PNSRWK_7997
21@ = 40
gosub @PNSRWK_7967
set_lvar_int_to_lvar_int 23@ = 22@
21@ = 44
gosub @PNSRWK_7967
if and
  23@ == 0
  22@ == 24
goto_if_false @PNSRWK_12623
22@ = 0
gosub @PNSRWK_7997

:PNSRWK_12623
return 

:PNSRWK_12625
if 
  0 > 22@
goto_if_false @PNSRWK_7997
22@ = 0
goto @PNSRWK_7997

:PNSRWK_12657
if 
  22@ > 24
goto_if_false @PNSRWK_12625
22@ = 24
goto @PNSRWK_7997

:PNSRWK_12689
if 
  2@ == 1
goto_if_false @PNSRWK_13135
29@ = get_label_pointer @PNSRWK_13456
if 
  0@ == 1
goto_if_false @PNSRWK_13068
if 
  5@ == 2
goto_if_false @PNSRWK_12845
string_format 29@ {format} "~y~PAY 'N' SPRAY REWORKED 1.0.0~r~ off: another mod changed the Pay 'n' Spray"
goto @PNSRWK_13122

:PNSRWK_12845
if 
  5@ == 0
goto_if_false @PNSRWK_12940
string_format 29@ {format} "~y~PAY 'N' SPRAY REWORKED 1.0.0~r~ off: no memory for its code"
goto @PNSRWK_13122

:PNSRWK_12940
if 
  3@ == 1
goto_if_false @PNSRWK_13016
string_format 29@ {format} "~y~PAY 'N' SPRAY REWORKED 1.0.0~w~ reloaded"
goto @PNSRWK_13122

:PNSRWK_13016
string_format 29@ {format} "~y~PAY 'N' SPRAY REWORKED 1.0.0~w~ on"
goto @PNSRWK_13122

:PNSRWK_13068
string_format 29@ {format} "~y~PAY 'N' SPRAY REWORKED 1.0.0~w~ off (AZ5=0)"

:PNSRWK_13122
print_formatted_now "%s" {time} 3000 {args} 29@ 

:PNSRWK_13135
return 

:PNSRWK_13137
hex
 B8 C4 C7 44 00 FF E0 89 F1 B8 50 A7 44 00 FF D0
 84 C0 74 04 C6 46 4D 00 B8 C4 C7 44 00 FF E0 89
 F1 B8 60 A6 44 00 FF D0 84 C0 74 04 C6 46 4D 01
 B8 C4 C7 44 00 FF E0
end

:PNSRWK_13192
hex
 00(128)
end

:PNSRWK_13320
hex
 00(128)
end

:PNSRWK_13448
hex
 00(8)
end

:PNSRWK_13456
hex
 00(128)
end
