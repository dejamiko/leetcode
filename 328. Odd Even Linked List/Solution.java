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
    public ListNode oddEvenList(ListNode head) \{\
        ListNode t=head;\
        if(head==null || head.next==null)\
            return head;\
        ListNode odd=new ListNode(head.val);\
        ListNode even=new ListNode(head.next.val);\
        t=t.next.next;\
        ListNode p=even;\
        ListNode b=odd;\
        boolean isodd=true;\
        while(t!=null)\
        \{\
            if(isodd)\
            \{\
                odd.next=new ListNode(t.val);\
                odd=odd.next;\
                isodd=false;\
            \}\
            else\
            \{\
                isodd=true;\
                even.next=new ListNode(t.val);\
                even=even.next;\
            \}\
            t=t.next;\
        \}\
        odd.next=p;\
        return b;\
    \}\
\}}