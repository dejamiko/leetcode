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
 *     ListNode() \{\}\
 *     ListNode(int val) \{ this.val = val; \}\
 *     ListNode(int val, ListNode next) \{ this.val = val; this.next = next; \}\
 * \}\
 */\
class Solution \{\
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) \{\
        ListNode ans=new ListNode((l1.val+l2.val)%10);\
        ListNode t=l1, r=l2, b=ans;\
        int carry=(t.val+r.val)/10;\
        t=t.next;\
        r=r.next;\
        while(t!=null && r!=null)\
        \{\
            int k=t.val+r.val+carry;\
            if(k>9)\
                carry=k/10;\
            else\
                carry=0;\
            b.next=new ListNode(k%10);\
            b=b.next;\
            t=t.next;\
            r=r.next;\
        \}\
        while(t!=null)\
        \{\
            int k=t.val+carry;\
            if(k>9)\
                carry=k/10;\
            else\
                carry=0;\
            b.next=new ListNode(k%10);\
            b=b.next;\
            t=t.next;\
        \}\
        while(r!=null)\
        \{\
            int k=r.val+carry;\
            if(k>9)\
                carry=k/10;\
            else\
                carry=0;\
            b.next=new ListNode(k%10);\
            b=b.next;\
            r=r.next;\
        \}\
        if(carry>0)\
            b.next=new ListNode(carry);\
        return ans;\
    \}\
\}}