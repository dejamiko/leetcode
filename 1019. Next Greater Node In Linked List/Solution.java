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
    public int[] nextLargerNodes(ListNode head) \{\
        ArrayList<Integer> t=new ArrayList<>();\
        while(head!=null)\
        \{\
            t.add(head.val);\
            head=head.next;\
        \}\
        int[] ans=new int[t.size()];\
        for(int i=0; i<t.size(); ++i)\
            for(int j=i+1; j<t.size(); ++j)\
                if(t.get(i)<t.get(j))\
                \{\
                    ans[i]=t.get(j);\
                    break;\
                \}\
        return ans;\
    \}\
\}}