{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /**\
 * Definition for singly-linked list.\
 * public class ListNode \{\
 *     int val;\
 *     ListNode next;\
 *     ListNode(int x) \{\
 *         val = x;\
 *         next = null;\
 *     \}\
 * \}\
 */\
public class Solution \{\
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) \{\
        if(headA==headB)\
            return headA;\
        while(headA!=null)\
        \{\
            ListNode t=headB;\
            while(t!=null)\
            \{\
                if(t==headA)\
                    return headA;\
                t=t.next;\
            \}\
            headA=headA.next;\
        \}\
        return null;\
    \}\
\}}