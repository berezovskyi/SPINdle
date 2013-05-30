/**
 * SPINdle (version 2.2.2)
 * Copyright (C) 2009-2012 NICTA Ltd.
 *
 * This file is part of SPINdle project.
 * 
 * SPINdle is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * SPINdle is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with SPINdle.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author H.-P. Lam (oleklam@gmail.com), National ICT Australia - Queensland Research Laboratory 
 */
/* Generated By:JavaCC: Do not edit this line. DflTheoryParser2baseTokenManager.java */
package spindle.io.parser.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import spindle.core.dom.AppConstant;
import spindle.core.dom.AppConstants;
import spindle.core.dom.Conclusion;
import spindle.core.dom.ConclusionType;
import spindle.core.dom.DomUtilities;
import spindle.core.dom.Literal;
import spindle.core.dom.LiteralVariable;
import spindle.core.dom.Mode;
import spindle.core.dom.Rule;
import spindle.core.dom.RuleType;
import spindle.core.dom.Superiority;
import spindle.core.dom.Temporal;
import spindle.core.dom.Theory;
import spindle.core.dom.TheoryException;
import spindle.core.dom.impl.Duration;
import spindle.core.dom.impl.Val;

/** Token Manager. */
@SuppressWarnings("unused")
public class DflTheoryParser2baseTokenManager implements DflTheoryParser2baseConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x4002020000L) != 0L)
            return 25;
         if ((active0 & 0x200080000L) != 0L)
         {
            jjmatchedKind = 48;
            return -1;
         }
         if ((active0 & 0x1800000L) != 0L)
            return 29;
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 29;
            return 30;
         }
         if ((active0 & 0x2000000000L) != 0L)
            return 20;
         return -1;
      case 1:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
            return 30;
         }
         if ((active0 & 0x200080000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 1;
            return 29;
         }
         return -1;
      case 2:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 2;
            return 29;
         }
         if ((active0 & 0x400000L) != 0L)
            return 30;
         return -1;
      case 3:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 3;
            return 29;
         }
         return -1;
      case 4:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 4;
            return 29;
         }
         return -1;
      case 5:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 5;
            return 29;
         }
         return -1;
      case 6:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 6;
            return 29;
         }
         return -1;
      case 7:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 7;
            return 29;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 31);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 35:
         return jjStopAtPos(0, 2);
      case 36:
         return jjStopAtPos(0, 15);
      case 40:
         return jjStopAtPos(0, 9);
      case 41:
         return jjStopAtPos(0, 10);
      case 42:
         return jjStopAtPos(0, 39);
      case 43:
         return jjStartNfaWithStates_0(0, 37, 20);
      case 44:
         return jjStopAtPos(0, 20);
      case 45:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x2020000L);
      case 47:
         return jjStopAtPos(0, 40);
      case 58:
         return jjStopAtPos(0, 21);
      case 60:
         jjmatchedKind = 42;
         return jjMoveStringLiteralDfa1_0(0x1400000000L);
      case 61:
         jjmatchedKind = 27;
         return jjMoveStringLiteralDfa1_0(0x100040000L);
      case 62:
         jjmatchedKind = 41;
         return jjMoveStringLiteralDfa1_0(0x800010000L);
      case 64:
         jjmatchedKind = 24;
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 91:
         return jjStopAtPos(0, 11);
      case 93:
         return jjStopAtPos(0, 12);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 123:
         return jjStopAtPos(0, 13);
      case 125:
         return jjStopAtPos(0, 14);
      case 126:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         break;
      case 62:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         else if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         break;
      case 68:
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 84:
      case 116:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 22, 30);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 70:
      case 102:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(3, 25);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 79:
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(8, 23, 29);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 29;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffffffffbffL & l) != 0L)
                  {
                     if (kind > 48)
                        kind = 48;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                     jjCheckNAddTwoStates(15, 16);
                  }
                  else if ((0x3100L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  else if ((0x100000200L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                  }
                  else if (curChar == 45)
                     jjAddStates(0, 1);
                  else if (curChar == 43)
                     jjAddStates(2, 3);
                  else if (curChar == 46)
                     jjCheckNAdd(3);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 28)
                        kind = 28;
                     jjCheckNAddStates(4, 9);
                  }
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(16);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                     jjCheckNAdd(15);
                  }
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 47)
                        kind = 47;
                     jjCheckNAdd(18);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(16);
                  }
                  break;
               case 1:
                  if ((0x100000200L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 2:
                  if (curChar == 46)
                     jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if ((0xfffffffffffffbffL & l) != 0L && kind > 48)
                     kind = 48;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAddStates(4, 9);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(10);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(11, 12);
                  break;
               case 12:
                  if (curChar != 46)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(13);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(13);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAddTwoStates(15, 16);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAdd(15);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(16);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(18);
                  break;
               case 19:
                  if (curChar == 43)
                     jjAddStates(2, 3);
                  break;
               case 21:
                  if ((0x100000200L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if ((0x100000200L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 24:
                  if (curChar == 45)
                     jjAddStates(0, 1);
                  break;
               case 26:
                  if ((0x100000200L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if ((0x100000200L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjstateSet[jjnewStateCnt++] = 28;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 25:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 0:
                  if (kind > 48)
                     kind = 48;
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                     jjCheckNAddTwoStates(15, 16);
                  }
                  else if (curChar == 64)
                     jjCheckNAddTwoStates(16, 18);
                  break;
               case 30:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(16);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                     jjCheckNAdd(15);
                  }
                  break;
               case 29:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 47)
                        kind = 47;
                     jjCheckNAdd(18);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(16);
                  }
                  break;
               case 20:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 4:
                  if (kind > 48)
                     kind = 48;
                  break;
               case 7:
                  if ((0x208211002082110L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(6);
                  break;
               case 8:
                  if ((0x8000000080000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(6);
                  break;
               case 9:
                  if ((0x200000002000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 14:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAddTwoStates(15, 16);
                  break;
               case 15:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAdd(15);
                  break;
               case 16:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(16);
                  break;
               case 17:
                  if (curChar == 64)
                     jjCheckNAddTwoStates(16, 18);
                  break;
               case 18:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(18);
                  break;
               case 22:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 27:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 48)
                     kind = 48;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 29 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(2, 0);
}
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 2;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0xfffffffffffffbffL & l) != 0L)
                  {
                     if (kind > 3)
                        kind = 3;
                     jjCheckNAddTwoStates(0, 1);
                  }
                  else if (curChar == 10)
                  {
                     if (kind > 3)
                        kind = 3;
                  }
                  break;
               case 0:
                  if ((0xfffffffffffffbffL & l) == 0L)
                     break;
                  kind = 3;
                  jjCheckNAddTwoStates(0, 1);
                  break;
               case 1:
                  if (curChar == 10)
                     kind = 3;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 0:
                  kind = 3;
                  jjCheckNAddTwoStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 0:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAddTwoStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 2 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   25, 27, 20, 22, 6, 7, 9, 10, 11, 12, 6, 7, 9, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\50", "\51", "\133", 
"\135", "\173", "\175", "\44", "\76\76", "\55\76", "\75\76", "\176\76", "\54", "\72", 
null, null, "\100", null, null, "\75", null, null, null, "\12", "\75\75", "\41\75", 
"\74\76", "\76\75", "\74\75", "\53", "\55", "\52", "\57", "\76", "\74", null, null, null, 
null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "X",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, 1, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3fffffffffe01L, 
};
static final long[] jjtoSkip = {
   0x3aL, 
};
static final long[] jjtoSpecial = {
   0x38L, 
};
static final long[] jjtoMore = {
   0x4L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[29];
private final int[] jjstateSet = new int[58];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public DflTheoryParser2baseTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public DflTheoryParser2baseTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 29; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         curTokenImage = "";
      else
         curTokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      curTokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      TokenLexicalActions(matchedToken);
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         if (jjmatchedPos == 0 && jjmatchedKind > 49)
         {
            jjmatchedKind = 49;
         }
         break;
       case 1:
         jjmatchedKind = 3;
         jjmatchedPos = -1;
         curPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
      image.setLength(0);
                    if (curLexState == X) System.err.println("Unterminated comment");
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
