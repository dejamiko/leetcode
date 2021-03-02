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
        StringBuilder sb1=new StringBuilder();\
        StringBuilder sb2=new StringBuilder();\
        StringBuilder sb3=new StringBuilder();\
        while(l1!=null)\
        \{\
            sb1.append(l1.val);\
            l1=l1.next;\
        \}\
        while(l2!=null)\
        \{\
            sb2.append(l2.val);\
            l2=l2.next;\
        \}\
        sb1=sb1.reverse();\
        sb2=sb2.reverse();\
        while(sb1.length()<sb2.length())\
            sb1.append('0');\
        while(sb2.length()<sb1.length())\
            sb2.append('0');\
        int carry=0;\
        ListNode ans=new ListNode(0);\
        ListNode p=ans;\
        for(int i=0; i<sb1.length(); ++i)\
        \{\
            int t=carry+sb1.charAt(i)-'0'+sb2.charAt(i)-'0';\
            if(t>9)\
            \{\
                t-=10;\
                carry=1;\
            \}\
            else\
                carry=0;\
            sb3.append(t);\
        \}\
        if(carry>0)\
            sb3.append(1);\
        sb3=sb3.reverse();\
        for(int i=0; i<sb3.length(); ++i)\
        \{\
            p.next=new ListNode(sb3.charAt(i)-'0');\
            p=p.next;\
        \}\
        return ans.next;\
    \}\
\}}