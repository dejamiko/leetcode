{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String complexNumberMultiply(String a, String b) \{\
        String[] a1=a.split("\\\\+");\
        String[] b1=b.split("\\\\+");\
        int x1=Integer.parseInt(a1[0]), x2=Integer.parseInt(b1[0]), y1=Integer.parseInt(a1[1].substring(0, a1[1].length()-1)), y2=Integer.parseInt(b1[1].substring(0, b1[1].length()-1));\
        return String.valueOf(x1*x2 - y1*y2) + "+" + String.valueOf(x1*y2 + x2*y1) + "i";\
    \}\
\}}