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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) \{\
        ListNode head;\
        if(l1==null && l2==null)\
            return null;\
        if(l1==null)\
            return l2;\
        if(l2==null)\
            return l1;\
        if(l1.val>l2.val)\
        \{\
            head=new ListNode(l2.val, null);\
            l2=l2.next;\
        \}\
        else\
        \{\
            head=new ListNode(l1.val, null);\
            l1=l1.next;\
        \}\
        ListNode t=head;\
        while(l1!=null && l2!=null)\
        \{\
            if(l1.val>l2.val)\
            \{\
                t.next=new ListNode(l2.val, null);\
                l2=l2.next;\
                t=t.next;\
            \}\
            else\
            \{\
                t.next=new ListNode(l1.val, null);\
                l1=l1.next;\
                t=t.next;\
            \}\
        \}\
        while(l2!=null)\
        \{\
            t.next=new ListNode(l2.val, null);\
            l2=l2.next;\
            t=t.next;\
        \}\
        while(l1!=null)\
        \{\
            t.next=new ListNode(l1.val, null);\
            l1=l1.next;\
            t=t.next;\
        \}    \
        return head;\
    \}\
\}}