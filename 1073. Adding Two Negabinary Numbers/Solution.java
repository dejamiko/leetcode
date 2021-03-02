{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] addNegabinary(int[] arr1, int[] arr2) \{\
        StringBuilder a=new StringBuilder();\
        StringBuilder b=new StringBuilder();\
        StringBuilder c=new StringBuilder();\
        for(int i=0; i<arr1.length; ++i)\
            a.append((char)(arr1[i]+'0'));\
        for(int i=0; i<arr2.length; ++i)\
            b.append((char)(arr2[i]+'0'));\
        a.reverse();\
        b.reverse();\
        while(a.length()!=b.length())\
            if(a.length()<b.length())\
                a.append("0");\
            else\
                b.append("0");\
        a.reverse();\
        b.reverse();\
        int carry=0;\
        for(int i=a.length()-1; i>=0; --i)\
        \{\
            int t=carry+a.charAt(i)-'0'+b.charAt(i)-'0';\
            if(t==-1)\
                carry=1;\
            else if(t==2 || t==3)\
                carry=-1;\
            else \
                carry=0;\
            if(t==-1 || t==1 || t==3)\
                c.append("1");\
            else\
                c.append("0");\
        \}\
        if(carry==1)\
            c.append("1");\
        else if(carry==-1)\
            c.append("11");\
        boolean sth=false;\
        for(int i=0; i<c.length(); ++i)\
            if(c.charAt(i)!='0')\
                sth=true;\
        if(!sth)\
            return new int[]\{0\};\
        c.setLength(c.lastIndexOf("1")+1);\
        int[] ans=new int[c.length()];\
        for(int i=0; i<ans.length; ++i)\
            ans[i]=c.charAt(ans.length-1-i)-'0';\
        return ans;\
    \}\
\}}