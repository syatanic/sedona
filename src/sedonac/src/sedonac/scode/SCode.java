//
// Copyright (c) 2007 Tridium, Inc.
// Licensed under the Academic Free License version 3.0
//
// History:
//   15 Feb 07  Brian Frank  Creation
//

package sedonac.scode;

import java.util.*;

/**
 * SCode constants:
 *
 *   NOTE: this file is auto-generated by SCodeGen!!!
 */
public class SCode
{

////////////////////////////////////////////////////////////////
// OpCodes
////////////////////////////////////////////////////////////////


  // literals
  public static final int Nop                = 0;    // no op
  public static final int LoadIM1            = 1;    // push -1 on stack
  public static final int LoadI0             = 2;    // push 0 on stack
  public static final int LoadI1             = 3;    // push 1 on stack
  public static final int LoadI2             = 4;    // push 2 on stack
  public static final int LoadI3             = 5;    // push 3 on stack
  public static final int LoadI4             = 6;    // push 4 on stack
  public static final int LoadI5             = 7;    // push 5 on stack
  public static final int LoadIntU1          = 8;    // push u1 int literal on stack
  public static final int LoadIntU2          = 9;    // push u2 int literal on stack
  public static final int LoadL0             = 10;   // push 0L on stack
  public static final int LoadL1             = 11;   // push 1L on stack
  public static final int LoadF0             = 12;   // push 0.0f on stack
  public static final int LoadF1             = 13;   // push 1.0f on stack
  public static final int LoadD0             = 14;   // push 0.0d on stack
  public static final int LoadD1             = 15;   // push 1.0d on stack
  public static final int LoadNull           = 16;   // push null pointer (0) on stack
  public static final int LoadNullBool       = 17;   // push null bool (2) on stack
  public static final int LoadNullFloat      = 18;   // push null float (nan) on stack
  public static final int LoadNullDouble     = 19;   // push null double (nan) on stack
  public static final int LoadInt            = 20;   // push int literal on stack from block index
  public static final int LoadFloat          = 21;   // push float literal on stack from block index
  public static final int LoadLong           = 22;   // push long literal on stack from block index
  public static final int LoadDouble         = 23;   // push double literal on stack from block index
  public static final int LoadStr            = 24;   // push Str literal pointer on stack from block index
  public static final int LoadBuf            = 25;   // push Buf literal pointer on stack from block index
  public static final int LoadType           = 26;   // push type pointer on stack from block index
  public static final int LoadSlot           = 27;   // push slot pointer on stack from block index
  public static final int LoadDefine         = 28;   // load define literal (ir only)

  // load params
  public static final int LoadParam0         = 29;   // push param 0 on stack
  public static final int LoadParam1         = 30;   // push param 1 on stack
  public static final int LoadParam2         = 31;   // push param 2 on stack
  public static final int LoadParam3         = 32;   // push param 3 on stack
  public static final int LoadParam          = 33;   // push param x on stack
  public static final int LoadParamWide      = 34;   // push wide param x on stack (long/double)

  // store params
  public static final int StoreParam         = 35;   // store stack to param x
  public static final int StoreParamWide     = 36;   // store stack to wide param x (long/double)

  // load locals
  public static final int LoadLocal0         = 37;   // push local 0 on stack
  public static final int LoadLocal1         = 38;   // push local 1 on stack
  public static final int LoadLocal2         = 39;   // push local 2 on stack
  public static final int LoadLocal3         = 40;   // push local 3 on stack
  public static final int LoadLocal4         = 41;   // push local 4 on stack
  public static final int LoadLocal5         = 42;   // push local 5 on stack
  public static final int LoadLocal6         = 43;   // push local 6 on stack
  public static final int LoadLocal7         = 44;   // push local 7 on stack
  public static final int LoadLocal          = 45;   // push local x on stack
  public static final int LoadLocalWide      = 46;   // push wide local x on stack (long/double)

  // store locals
  public static final int StoreLocal0        = 47;   // store stack to local 0
  public static final int StoreLocal1        = 48;   // store stack to local 1
  public static final int StoreLocal2        = 49;   // store stack to local 2
  public static final int StoreLocal3        = 50;   // store stack to local 3
  public static final int StoreLocal4        = 51;   // store stack to local 4
  public static final int StoreLocal5        = 52;   // store stack to local 5
  public static final int StoreLocal6        = 53;   // store stack to local 6
  public static final int StoreLocal7        = 54;   // store stack to local 7
  public static final int StoreLocal         = 55;   // store stack to local x
  public static final int StoreLocalWide     = 56;   // store stack to local x (long/double)

  // int compare
  public static final int IntEq              = 57;   // a == b
  public static final int IntNotEq           = 58;   // a != b
  public static final int IntGt              = 59;   // a > b
  public static final int IntGtEq            = 60;   // a >= b
  public static final int IntLt              = 61;   // a < b
  public static final int IntLtEq            = 62;   // a <= b

  // int math
  public static final int IntMul             = 63;   // a * b
  public static final int IntDiv             = 64;   // a / b
  public static final int IntMod             = 65;   // a % b
  public static final int IntAdd             = 66;   // a + b
  public static final int IntSub             = 67;   // a - b
  public static final int IntOr              = 68;   // a | b
  public static final int IntXor             = 69;   // a ^ b
  public static final int IntAnd             = 70;   // a & b
  public static final int IntNot             = 71;   // ~a
  public static final int IntNeg             = 72;   // -a
  public static final int IntShiftL          = 73;   // a << b
  public static final int IntShiftR          = 74;   // a >> b
  public static final int IntInc             = 75;   // a + 1
  public static final int IntDec             = 76;   // a - 1

  // long compare
  public static final int LongEq             = 77;   // a == b
  public static final int LongNotEq          = 78;   // a != b
  public static final int LongGt             = 79;   // a > b
  public static final int LongGtEq           = 80;   // a >= b
  public static final int LongLt             = 81;   // a < b
  public static final int LongLtEq           = 82;   // a <= b

  // long math
  public static final int LongMul            = 83;   // a * b
  public static final int LongDiv            = 84;   // a / b
  public static final int LongMod            = 85;   // a % b
  public static final int LongAdd            = 86;   // a + b
  public static final int LongSub            = 87;   // a - b
  public static final int LongOr             = 88;   // a | b
  public static final int LongXor            = 89;   // a ^ b
  public static final int LongAnd            = 90;   // a & b
  public static final int LongNot            = 91;   // ~a
  public static final int LongNeg            = 92;   // -a
  public static final int LongShiftL         = 93;   // a << b
  public static final int LongShiftR         = 94;   // a >> b

  // float compare
  public static final int FloatEq            = 95;   // a == b
  public static final int FloatNotEq         = 96;   // a != b
  public static final int FloatGt            = 97;   // a > b
  public static final int FloatGtEq          = 98;   // a >= b
  public static final int FloatLt            = 99;   // a < b
  public static final int FloatLtEq          = 100;  // a <= b

  // float math
  public static final int FloatMul           = 101;  // a * b
  public static final int FloatDiv           = 102;  // a / b
  public static final int FloatAdd           = 103;  // a + b
  public static final int FloatSub           = 104;  // a - b
  public static final int FloatNeg           = 105;  // -a

  // double compare
  public static final int DoubleEq           = 106;  // a == b
  public static final int DoubleNotEq        = 107;  // a != b
  public static final int DoubleGt           = 108;  // a > b
  public static final int DoubleGtEq         = 109;  // a >= b
  public static final int DoubleLt           = 110;  // a < b
  public static final int DoubleLtEq         = 111;  // a <= b

  // double math
  public static final int DoubleMul          = 112;  // a * b
  public static final int DoubleDiv          = 113;  // a / b
  public static final int DoubleAdd          = 114;  // a + b
  public static final int DoubleSub          = 115;  // a - b
  public static final int DoubleNeg          = 116;  // -a

  // casts
  public static final int IntToFloat         = 117;  // int -> float
  public static final int IntToLong          = 118;  // int -> long
  public static final int IntToDouble        = 119;  // int -> double
  public static final int LongToInt          = 120;  // long -> int
  public static final int LongToFloat        = 121;  // long -> float
  public static final int LongToDouble       = 122;  // long -> double
  public static final int FloatToInt         = 123;  // float -> int
  public static final int FloatToLong        = 124;  // float -> long
  public static final int FloatToDouble      = 125;  // float -> double
  public static final int DoubleToInt        = 126;  // double -> int
  public static final int DoubleToLong       = 127;  // double -> long
  public static final int DoubleToFloat      = 128;  // double -> float

  // object compare
  public static final int ObjEq              = 129;  // a == b
  public static final int ObjNotEq           = 130;  // a != b

  // general purpose compare
  public static final int EqZero             = 131;  // a == 0 or null
  public static final int NotEqZero          = 132;  // a != 0 or null

  // stack manipulation
  public static final int Pop                = 133;  // pop top of stack
  public static final int Pop2               = 134;  // pop top two cells of stack
  public static final int Pop3               = 135;  // pop top three cells of stack
  public static final int Dup                = 136;  // duplicate top of stack
  public static final int Dup2               = 137;  // duplicate top two cells of stack
  public static final int DupDown2           = 138;  // duplicate top of stack, push down 2 cells
  public static final int DupDown3           = 139;  // duplicate top of stack, push down 3 cells
  public static final int Dup2Down2          = 140;  // duplicate top two cells of stack, push down 2 cells
  public static final int Dup2Down3          = 141;  // duplicate top two cells of stack, push down 3 cells

  // branching
  public static final int Jump               = 142;  // unconditional jump (1 sbyte offset)
  public static final int JumpNonZero        = 143;  // jump if non-zero (1 sbyte offset)
  public static final int JumpZero           = 144;  // jump if zero (1 sbyte offset)
  public static final int Foreach            = 145;  // array, length, counter on stack (1 sbyte offset)
  public static final int JumpFar            = 146;  // unconditional far jump (2 sbyte offset)
  public static final int JumpFarNonZero     = 147;  // far jump if true (2 sbyte offset)
  public static final int JumpFarZero        = 148;  // far jump if false (2 sbyte offset)
  public static final int ForeachFar         = 149;  // array, length, counter on stack (2 sbyte offset)

  // int compare branching
  public static final int JumpIntEq          = 150;  // jump if a == b
  public static final int JumpIntNotEq       = 151;  // jump if a != b
  public static final int JumpIntGt          = 152;  // jump if a > b
  public static final int JumpIntGtEq        = 153;  // jump if a >= b
  public static final int JumpIntLt          = 154;  // jump if a < b
  public static final int JumpIntLtEq        = 155;  // jump if a <= b
  public static final int JumpFarIntEq       = 156;  // jump if a == b
  public static final int JumpFarIntNotEq    = 157;  // jump if a != b
  public static final int JumpFarIntGt       = 158;  // jump if a > b
  public static final int JumpFarIntGtEq     = 159;  // jump if a >= b
  public static final int JumpFarIntLt       = 160;  // jump if a < b
  public static final int JumpFarIntLtEq     = 161;  // jump if a <= b

  // storage
  public static final int LoadDataAddr       = 162;  // load data segment base address of static fields

  // 8 bit storage (bytes, bools)
  public static final int Load8BitFieldU1    = 163;  // load 8 bit field (1 ubyte offset)
  public static final int Load8BitFieldU2    = 164;  // load 8 bit field (2 ubyte offset)
  public static final int Load8BitFieldU4    = 165;  // load 8 bit field (4 ubyte offset)
  public static final int Load8BitArray      = 166;  // load 8 bit array item (int offset on stack)
  public static final int Store8BitFieldU1   = 167;  // store 8 bit field (1 ubyte offset)
  public static final int Store8BitFieldU2   = 168;  // store 8 bit field (2 ubyte offset)
  public static final int Store8BitFieldU4   = 169;  // store 8 bit field (4 ubyte offset)
  public static final int Store8BitArray     = 170;  // store 8 bit array item (int offset on stack)
  public static final int Add8BitArray       = 171;  // add int on stack to 8 bit array pointer

  // 16 bit storage (shorts)
  public static final int Load16BitFieldU1   = 172;  // load 16 bit field (1 ubyte offset)
  public static final int Load16BitFieldU2   = 173;  // load 16 bit field (2 ubyte offset)
  public static final int Load16BitFieldU4   = 174;  // load 16 bit field (4 ubyte offset)
  public static final int Load16BitArray     = 175;  // load 16 bit array item (int offset on stack)
  public static final int Store16BitFieldU1  = 176;  // store 16 bit field (1 ubyte offset)
  public static final int Store16BitFieldU2  = 177;  // store 16 bit field (2 ubyte offset)
  public static final int Store16BitFieldU4  = 178;  // store 16 bit field (4 ubyte offset)
  public static final int Store16BitArray    = 179;  // store 16 bit array item (int offset on stack)
  public static final int Add16BitArray      = 180;  // add int on stack to 8 bit array pointer

  // 32 bit storage (int/float)
  public static final int Load32BitFieldU1   = 181;  // load 32 bit field (1 ubyte offset)
  public static final int Load32BitFieldU2   = 182;  // load 32 bit field (2 ubyte offset)
  public static final int Load32BitFieldU4   = 183;  // load 32 bit field (4 ubyte offset)
  public static final int Load32BitArray     = 184;  // load 32 bit array item (int offset on stack)
  public static final int Store32BitFieldU1  = 185;  // store 32 bit field (1 ubyte offset)
  public static final int Store32BitFieldU2  = 186;  // store 32 bit field (2 ubyte offset)
  public static final int Store32BitFieldU4  = 187;  // store 32 bit field (4 ubyte offset)
  public static final int Store32BitArray    = 188;  // store 32 bit array item (int offset on stack)
  public static final int Add32BitArray      = 189;  // add int on stack to 32 bit array pointer

  // 64 bit storage (long/double)
  public static final int Load64BitFieldU1   = 190;  // load 64 bit field (1 ubyte offset)
  public static final int Load64BitFieldU2   = 191;  // load 64 bit field (2 ubyte offset)
  public static final int Load64BitFieldU4   = 192;  // load 64 bit field (4 ubyte offset)
  public static final int Load64BitArray     = 193;  // load 64 bit array item (int offset on stack)
  public static final int Store64BitFieldU1  = 194;  // store 64 bit field (1 ubyte offset)
  public static final int Store64BitFieldU2  = 195;  // store 64 bit field (2 ubyte offset)
  public static final int Store64BitFieldU4  = 196;  // store 64 bit field (4 ubyte offset)
  public static final int Store64BitArray    = 197;  // store 64 bit array item (int offset on stack)
  public static final int Add64BitArray      = 198;  // add int on stack to 64 bit array pointer

  // ref storage (pointers - variable width)
  public static final int LoadRefFieldU1     = 199;  // load pointer field (1 ubyte offset)
  public static final int LoadRefFieldU2     = 200;  // load pointer field (2 ubyte offset)
  public static final int LoadRefFieldU4     = 201;  // load pointer field (4 ubyte offset)
  public static final int LoadRefArray       = 202;  // load pointer array item (int offset on stack)
  public static final int StoreRefFieldU1    = 203;  // store pointer field (1 ubyte offset)
  public static final int StoreRefFieldU2    = 204;  // store pointer field (2 ubyte offset)
  public static final int StoreRefFieldU4    = 205;  // store pointer field (4 ubyte offset)
  public static final int StoreRefArray      = 206;  // store pointer array item (int offset on stack)
  public static final int AddRefArray        = 207;  // add int on stack to pointer array pointer

  // const storage (block index)
  public static final int LoadConstFieldU1   = 208;  // load const instance field (1 ubyte offset)
  public static final int LoadConstFieldU2   = 209;  // load const instance field (2 ubyte offset)
  public static final int LoadConstStatic    = 210;  // load const static field (2 block index)
  public static final int LoadConstArray     = 211;  // load const pointer array item (int offset on stack)

  // inline storage (pointer addition)
  public static final int LoadInlineFieldU1  = 212;  // load inline field (1 ubyte offset)
  public static final int LoadInlineFieldU2  = 213;  // load inline field (2 ubyte offset)
  public static final int LoadInlineFieldU4  = 214;  // load inline field (4 ubyte offset)

  // param0 + inline storage
  public static final int LoadParam0InlineFieldU1 = 215;  // LoadParam0 + LoadInlineFieldU1
  public static final int LoadParam0InlineFieldU2 = 216;  // LoadParam0 + LoadInlineFieldU2
  public static final int LoadParam0InlineFieldU4 = 217;  // LoadParam0 + LoadInlineFieldU4

  // static + inline storage
  public static final int LoadDataInlineFieldU1 = 218;  // LoadDataAddr + LoadInlineFieldU1
  public static final int LoadDataInlineFieldU2 = 219;  // LoadDataAddr + LoadInlineFieldU2
  public static final int LoadDataInlineFieldU4 = 220;  // LoadDataAddr + LoadInlineFieldU4

  // call control
  public static final int Call               = 221;  // u2 block index (unaligned!) to non-virtual method
  public static final int CallVirtual        = 222;  // scode: u2 u1 - block index to type (unaligned!), num params
  public static final int CallNative         = 223;  // scode: u1 u1 u1 - kit index, method index, num params
  public static final int CallNativeWide     = 224;  // scode: u1 u1 u1 - kit index, method index, num params
  public static final int CallNativeVoid     = 225;  // scode: u1 u1 u1 - kit index, method index, num params
  public static final int ReturnVoid         = 226;  // return void
  public static final int ReturnPop          = 227;  // return top of stack
  public static final int ReturnPopWide      = 228;  // return top of stack (wide - long/double)
  public static final int LoadParam0Call     = 229;  // param0 + call

  // misc
  public static final int InitArray          = 230;  // addr, length, sizeof on stack; setup inline obj array pointers
  public static final int InitVirt           = 231;  // init Virtual.vtable; this on stack
  public static final int InitComp           = 232;  // init Component.type; this on stack
  public static final int SizeOf             = 233;  // size of type in bytes (IR only)
  public static final int Assert             = 234;  // assert top of stack, u2 is linenum
  public static final int Switch             = 235;  // switch with index into jump table (u2 is table count)
  public static final int MetaSlot           = 236;  // inline meta-data, index to slot qname triple
  public static final int Cast               = 237;  // only used for Java bytecode
  public static final int LoadArrayLiteral   = 238;  // in SVM we use LoadBuf as pointer to array in code section

  // OpCodes by name
  public static final String[] names =
  {
    "Nop",                // 0
    "LoadIM1",            // 1
    "LoadI0",             // 2
    "LoadI1",             // 3
    "LoadI2",             // 4
    "LoadI3",             // 5
    "LoadI4",             // 6
    "LoadI5",             // 7
    "LoadIntU1",          // 8
    "LoadIntU2",          // 9
    "LoadL0",             // 10
    "LoadL1",             // 11
    "LoadF0",             // 12
    "LoadF1",             // 13
    "LoadD0",             // 14
    "LoadD1",             // 15
    "LoadNull",           // 16
    "LoadNullBool",       // 17
    "LoadNullFloat",      // 18
    "LoadNullDouble",     // 19
    "LoadInt",            // 20
    "LoadFloat",          // 21
    "LoadLong",           // 22
    "LoadDouble",         // 23
    "LoadStr",            // 24
    "LoadBuf",            // 25
    "LoadType",           // 26
    "LoadSlot",           // 27
    "LoadDefine",         // 28
    "LoadParam0",         // 29
    "LoadParam1",         // 30
    "LoadParam2",         // 31
    "LoadParam3",         // 32
    "LoadParam",          // 33
    "LoadParamWide",      // 34
    "StoreParam",         // 35
    "StoreParamWide",     // 36
    "LoadLocal0",         // 37
    "LoadLocal1",         // 38
    "LoadLocal2",         // 39
    "LoadLocal3",         // 40
    "LoadLocal4",         // 41
    "LoadLocal5",         // 42
    "LoadLocal6",         // 43
    "LoadLocal7",         // 44
    "LoadLocal",          // 45
    "LoadLocalWide",      // 46
    "StoreLocal0",        // 47
    "StoreLocal1",        // 48
    "StoreLocal2",        // 49
    "StoreLocal3",        // 50
    "StoreLocal4",        // 51
    "StoreLocal5",        // 52
    "StoreLocal6",        // 53
    "StoreLocal7",        // 54
    "StoreLocal",         // 55
    "StoreLocalWide",     // 56
    "IntEq",              // 57
    "IntNotEq",           // 58
    "IntGt",              // 59
    "IntGtEq",            // 60
    "IntLt",              // 61
    "IntLtEq",            // 62
    "IntMul",             // 63
    "IntDiv",             // 64
    "IntMod",             // 65
    "IntAdd",             // 66
    "IntSub",             // 67
    "IntOr",              // 68
    "IntXor",             // 69
    "IntAnd",             // 70
    "IntNot",             // 71
    "IntNeg",             // 72
    "IntShiftL",          // 73
    "IntShiftR",          // 74
    "IntInc",             // 75
    "IntDec",             // 76
    "LongEq",             // 77
    "LongNotEq",          // 78
    "LongGt",             // 79
    "LongGtEq",           // 80
    "LongLt",             // 81
    "LongLtEq",           // 82
    "LongMul",            // 83
    "LongDiv",            // 84
    "LongMod",            // 85
    "LongAdd",            // 86
    "LongSub",            // 87
    "LongOr",             // 88
    "LongXor",            // 89
    "LongAnd",            // 90
    "LongNot",            // 91
    "LongNeg",            // 92
    "LongShiftL",         // 93
    "LongShiftR",         // 94
    "FloatEq",            // 95
    "FloatNotEq",         // 96
    "FloatGt",            // 97
    "FloatGtEq",          // 98
    "FloatLt",            // 99
    "FloatLtEq",          // 100
    "FloatMul",           // 101
    "FloatDiv",           // 102
    "FloatAdd",           // 103
    "FloatSub",           // 104
    "FloatNeg",           // 105
    "DoubleEq",           // 106
    "DoubleNotEq",        // 107
    "DoubleGt",           // 108
    "DoubleGtEq",         // 109
    "DoubleLt",           // 110
    "DoubleLtEq",         // 111
    "DoubleMul",          // 112
    "DoubleDiv",          // 113
    "DoubleAdd",          // 114
    "DoubleSub",          // 115
    "DoubleNeg",          // 116
    "IntToFloat",         // 117
    "IntToLong",          // 118
    "IntToDouble",        // 119
    "LongToInt",          // 120
    "LongToFloat",        // 121
    "LongToDouble",       // 122
    "FloatToInt",         // 123
    "FloatToLong",        // 124
    "FloatToDouble",      // 125
    "DoubleToInt",        // 126
    "DoubleToLong",       // 127
    "DoubleToFloat",      // 128
    "ObjEq",              // 129
    "ObjNotEq",           // 130
    "EqZero",             // 131
    "NotEqZero",          // 132
    "Pop",                // 133
    "Pop2",               // 134
    "Pop3",               // 135
    "Dup",                // 136
    "Dup2",               // 137
    "DupDown2",           // 138
    "DupDown3",           // 139
    "Dup2Down2",          // 140
    "Dup2Down3",          // 141
    "Jump",               // 142
    "JumpNonZero",        // 143
    "JumpZero",           // 144
    "Foreach",            // 145
    "JumpFar",            // 146
    "JumpFarNonZero",     // 147
    "JumpFarZero",        // 148
    "ForeachFar",         // 149
    "JumpIntEq",          // 150
    "JumpIntNotEq",       // 151
    "JumpIntGt",          // 152
    "JumpIntGtEq",        // 153
    "JumpIntLt",          // 154
    "JumpIntLtEq",        // 155
    "JumpFarIntEq",       // 156
    "JumpFarIntNotEq",    // 157
    "JumpFarIntGt",       // 158
    "JumpFarIntGtEq",     // 159
    "JumpFarIntLt",       // 160
    "JumpFarIntLtEq",     // 161
    "LoadDataAddr",       // 162
    "Load8BitFieldU1",    // 163
    "Load8BitFieldU2",    // 164
    "Load8BitFieldU4",    // 165
    "Load8BitArray",      // 166
    "Store8BitFieldU1",   // 167
    "Store8BitFieldU2",   // 168
    "Store8BitFieldU4",   // 169
    "Store8BitArray",     // 170
    "Add8BitArray",       // 171
    "Load16BitFieldU1",   // 172
    "Load16BitFieldU2",   // 173
    "Load16BitFieldU4",   // 174
    "Load16BitArray",     // 175
    "Store16BitFieldU1",  // 176
    "Store16BitFieldU2",  // 177
    "Store16BitFieldU4",  // 178
    "Store16BitArray",    // 179
    "Add16BitArray",      // 180
    "Load32BitFieldU1",   // 181
    "Load32BitFieldU2",   // 182
    "Load32BitFieldU4",   // 183
    "Load32BitArray",     // 184
    "Store32BitFieldU1",  // 185
    "Store32BitFieldU2",  // 186
    "Store32BitFieldU4",  // 187
    "Store32BitArray",    // 188
    "Add32BitArray",      // 189
    "Load64BitFieldU1",   // 190
    "Load64BitFieldU2",   // 191
    "Load64BitFieldU4",   // 192
    "Load64BitArray",     // 193
    "Store64BitFieldU1",  // 194
    "Store64BitFieldU2",  // 195
    "Store64BitFieldU4",  // 196
    "Store64BitArray",    // 197
    "Add64BitArray",      // 198
    "LoadRefFieldU1",     // 199
    "LoadRefFieldU2",     // 200
    "LoadRefFieldU4",     // 201
    "LoadRefArray",       // 202
    "StoreRefFieldU1",    // 203
    "StoreRefFieldU2",    // 204
    "StoreRefFieldU4",    // 205
    "StoreRefArray",      // 206
    "AddRefArray",        // 207
    "LoadConstFieldU1",   // 208
    "LoadConstFieldU2",   // 209
    "LoadConstStatic",    // 210
    "LoadConstArray",     // 211
    "LoadInlineFieldU1",  // 212
    "LoadInlineFieldU2",  // 213
    "LoadInlineFieldU4",  // 214
    "LoadParam0InlineFieldU1", // 215
    "LoadParam0InlineFieldU2", // 216
    "LoadParam0InlineFieldU4", // 217
    "LoadDataInlineFieldU1", // 218
    "LoadDataInlineFieldU2", // 219
    "LoadDataInlineFieldU4", // 220
    "Call",               // 221
    "CallVirtual",        // 222
    "CallNative",         // 223
    "CallNativeWide",     // 224
    "CallNativeVoid",     // 225
    "ReturnVoid",         // 226
    "ReturnPop",          // 227
    "ReturnPopWide",      // 228
    "LoadParam0Call",     // 229
    "InitArray",          // 230
    "InitVirt",           // 231
    "InitComp",           // 232
    "SizeOf",             // 233
    "Assert",             // 234
    "Switch",             // 235
    "MetaSlot",           // 236
    "Cast",               // 237
    "LoadArrayLiteral",   // 238
  };

  // OpCodes arguments
  public static int argType(int opcode)
  {
    switch(opcode)
    {
      case LoadIntU1:           return u1Arg;
      case LoadIntU2:           return u2Arg;
      case LoadInt:             return intArg;
      case LoadFloat:           return floatArg;
      case LoadLong:            return longArg;
      case LoadDouble:          return doubleArg;
      case LoadStr:             return strArg;
      case LoadBuf:             return bufArg;
      case LoadType:            return typeArg;
      case LoadSlot:            return slotArg;
      case LoadDefine:          return fieldArg;
      case LoadParam:           return u1Arg;
      case LoadParamWide:       return u1Arg;
      case StoreParam:          return u1Arg;
      case StoreParamWide:      return u1Arg;
      case LoadLocal:           return u1Arg;
      case LoadLocalWide:       return u1Arg;
      case StoreLocal:          return u1Arg;
      case StoreLocalWide:      return u1Arg;
      case Jump:                return jmpArg;
      case JumpNonZero:         return jmpArg;
      case JumpZero:            return jmpArg;
      case Foreach:             return jmpArg;
      case JumpFar:             return jmpfarArg;
      case JumpFarNonZero:      return jmpfarArg;
      case JumpFarZero:         return jmpfarArg;
      case ForeachFar:          return jmpfarArg;
      case JumpIntEq:           return jmpArg;
      case JumpIntNotEq:        return jmpArg;
      case JumpIntGt:           return jmpArg;
      case JumpIntGtEq:         return jmpArg;
      case JumpIntLt:           return jmpArg;
      case JumpIntLtEq:         return jmpArg;
      case JumpFarIntEq:        return jmpfarArg;
      case JumpFarIntNotEq:     return jmpfarArg;
      case JumpFarIntGt:        return jmpfarArg;
      case JumpFarIntGtEq:      return jmpfarArg;
      case JumpFarIntLt:        return jmpfarArg;
      case JumpFarIntLtEq:      return jmpfarArg;
      case Load8BitFieldU1:     return fieldArg;
      case Load8BitFieldU2:     return fieldArg;
      case Load8BitFieldU4:     return fieldArg;
      case Store8BitFieldU1:    return fieldArg;
      case Store8BitFieldU2:    return fieldArg;
      case Store8BitFieldU4:    return fieldArg;
      case Load16BitFieldU1:    return fieldArg;
      case Load16BitFieldU2:    return fieldArg;
      case Load16BitFieldU4:    return fieldArg;
      case Store16BitFieldU1:   return fieldArg;
      case Store16BitFieldU2:   return fieldArg;
      case Store16BitFieldU4:   return fieldArg;
      case Load32BitFieldU1:    return fieldArg;
      case Load32BitFieldU2:    return fieldArg;
      case Load32BitFieldU4:    return fieldArg;
      case Store32BitFieldU1:   return fieldArg;
      case Store32BitFieldU2:   return fieldArg;
      case Store32BitFieldU4:   return fieldArg;
      case Load64BitFieldU1:    return fieldArg;
      case Load64BitFieldU2:    return fieldArg;
      case Load64BitFieldU4:    return fieldArg;
      case Store64BitFieldU1:   return fieldArg;
      case Store64BitFieldU2:   return fieldArg;
      case Store64BitFieldU4:   return fieldArg;
      case LoadRefFieldU1:      return fieldArg;
      case LoadRefFieldU2:      return fieldArg;
      case LoadRefFieldU4:      return fieldArg;
      case StoreRefFieldU1:     return fieldArg;
      case StoreRefFieldU2:     return fieldArg;
      case StoreRefFieldU4:     return fieldArg;
      case LoadConstFieldU1:    return fieldArg;
      case LoadConstFieldU2:    return fieldArg;
      case LoadConstStatic:     return fieldArg;
      case LoadInlineFieldU1:   return fieldArg;
      case LoadInlineFieldU2:   return fieldArg;
      case LoadInlineFieldU4:   return fieldArg;
      case LoadParam0InlineFieldU1: return fieldArg;
      case LoadParam0InlineFieldU2: return fieldArg;
      case LoadParam0InlineFieldU4: return fieldArg;
      case LoadDataInlineFieldU1: return fieldArg;
      case LoadDataInlineFieldU2: return fieldArg;
      case LoadDataInlineFieldU4: return fieldArg;
      case Call:                return methodArg;
      case CallVirtual:         return methodArg;
      case CallNative:          return methodArg;
      case CallNativeWide:      return methodArg;
      case CallNativeVoid:      return methodArg;
      case LoadParam0Call:      return methodArg;
      case InitVirt:            return typeArg;
      case InitComp:            return typeArg;
      case SizeOf:              return typeArg;
      case Assert:              return u2Arg;
      case Switch:              return switchArg;
      case MetaSlot:            return u2Arg;
      case Cast:                return typeArg;
      case LoadArrayLiteral:    return arrayArg;
      default:                  return noArg;
    }
  }

////////////////////////////////////////////////////////////////
// Misc Constants
////////////////////////////////////////////////////////////////

  public static final int vmMagic        = 0x5ED0BA07; // 4 byte magic
  public static final int vmMajorVer     = 0x01;    // 1 byte major version
  public static final int vmMinorVer     = 0x04;    // 1 byte minor version
  public static final int vmMaxParams    = 255;     // max num method parameters
  public static final int vmMaxLocals    = 255;     // max num method locals
  public static final int vmBigEndian    = 'B';     // big endian constant
  public static final int vmLittleEndian = 'L';     // little endian constant

////////////////////////////////////////////////////////////////
// OpCode Argument Types
////////////////////////////////////////////////////////////////

  public static final int noArg     = 0;
  public static final int u1Arg     = 1;
  public static final int u2Arg     = 2;
  public static final int s4Arg     = 3;
  public static final int intArg    = 4;
  public static final int longArg   = 5;
  public static final int floatArg  = 6;
  public static final int doubleArg = 7;
  public static final int strArg    = 8;
  public static final int bufArg    = 9;
  public static final int typeArg   = 10;
  public static final int slotArg   = 11; // slot literal
  public static final int fieldArg  = 12;
  public static final int methodArg = 13;
  public static final int jmpArg    = 14;
  public static final int jmpfarArg = 15;
  public static final int switchArg = 16;
  public static final int arrayArg  = 17; // array literal

////////////////////////////////////////////////////////////////
// SCode Image Flags
////////////////////////////////////////////////////////////////

  public static final int scodeDebug = 0x01;  // is debug compiled in
  public static final int scodeTest  = 0x02;  // are unit tests compiled in
  
////////////////////////////////////////////////////////////////
// Utils
////////////////////////////////////////////////////////////////

  public static int opcode(String name)
  {
    Integer opcode = (Integer)byName.get(name);
    if (opcode == null) return -1;
    return opcode.intValue();
  }

  public static String name(int opcode)
  {
    if (opcode < 0 || opcode >= names.length)
      return opcode + "?";
    else
      return names[opcode];
  }

  private static HashMap byName = new HashMap();
  static
  {
    for (int i=0; i<names.length; ++i)
      byName.put(names[i], new Integer(i));
  }

}
