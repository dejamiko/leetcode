{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String toHex(int num) \{\
        long a=num;\
        if(a==0)\
            return "0";\
        boolean neg=a<0;\
        if(neg)\
            a=a*(-1);\
        String ans="";\
        StringBuilder b=new StringBuilder("");\
        while(a>0)\
        \{\
            b.append(a%2);\
            a/=2;\
        \}\
        while(b.length()<32)\
            b.append(0);\
        b=b.reverse();\
        if(neg)\
        \{\
            for(int i=0; i<b.length(); ++i)\
            \{\
                if(b.charAt(i)=='1')\
                    b.setCharAt(i, '0');\
                else\
                    b.setCharAt(i, '1');\
            \}\
            for(int i=b.length()-1; i>=0; --i)\
            \{\
                if(b.charAt(i)=='0')\
                \{\
                    b.setCharAt(i, '1');\
                    break;\
                \}\
                else\
                    b.setCharAt(i, '0');\
            \}\
        \}\
        for(int i=0; i<b.length(); i+=4)\
        \{\
            switch(b.substring(i, i+4))\
            \{\
                case "0000":\
                    ans=ans+'0';\
                    break;\
                case "0001":\
                    ans=ans+'1';\
                    break;\
                case "0010":\
                    ans=ans+'2';\
                    break;\
                case "0011":\
                    ans=ans+'3';\
                    break;\
                case "0100":\
                    ans=ans+'4';\
                    break;\
                case "0101":\
                    ans=ans+'5';\
                    break;\
                case "0110":\
                    ans=ans+'6';\
                    break;\
                case "0111":\
                    ans=ans+'7';\
                    break;\
                case "1000":\
                    ans=ans+'8';\
                    break;\
                case "1001":\
                    ans=ans+'9';\
                    break;\
                case "1010":\
                    ans=ans+'a';\
                    break;\
                case "1011":\
                    ans=ans+'b';\
                    break;\
                case "1100":\
                    ans=ans+'c';\
                    break;\
                case "1101":\
                    ans=ans+'d';\
                    break;\
                case "1110":\
                    ans=ans+'e';\
                    break;\
                case "1111":\
                    ans=ans+'f';\
                    break;\
            \}\
        \}\
        int j=0;\
        for(int i=0; i<ans.length(); ++i, ++j)\
            if(ans.charAt(i)!='0')\
                break;\
        return ans.substring(j, ans.length());\
    \}\
\}}