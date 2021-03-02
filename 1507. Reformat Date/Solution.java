{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String reformatDate(String date) \{\
        String[] d=date.split(" ");\
        String ans=d[2]+"-";\
        String[] months=new String[]\{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"\};\
        String[] days=new String[]\{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th","9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"\};\
        for(int i=1; i<13; ++i)\
            if(months[i-1].equals(d[1]))\
            \{\
                if(i<10)\
                    ans+="0"+(char)(i+'0');\
                else if(i==10)\
                    ans=ans+"10";\
                else if(i==11)\
                    ans=ans+"11";\
                else\
                    ans=ans+"12";\
            \}\
        ans+="-";\
        for(int i=0; i<31; ++i)\
            if(days[i].equals(d[0]))\
            \{\
                if(i<9)\
                    ans+="0"+days[i].substring(0,1);\
                else\
                    ans+=days[i].substring(0,2);\
            \}\
        return ans;\
    \}\
\}}