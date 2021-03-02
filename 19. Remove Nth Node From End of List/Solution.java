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
    public ListNode removeNthFromEnd(ListNode head, int n) \{\
        int l=0;\
        ListNode t=head;\
        ListNode p=head;\
        if(p==null || p.next==null)\
            return null;\
        while(t!=null)\
        \{\
            t=t.next;\
            l++;\
        \}\
        if(n==l)\
            return p.next;\
        for(int i=0; i+n+1<l; ++i)\
            head=head.next;\
        System.out.println(head.val);\
        if(head.next!=null)\
            head.next=head.next.next;\
        else\
            head.next=null;\
        return p;\
    \}\
\}}