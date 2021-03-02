{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /** \
 * Forward declaration of guess API.\
 * @param  num   your guess\
 * @return 	     -1 if num is lower than the guess number\
 *			      1 if num is higher than the guess number\
 *               otherwise return 0\
 * int guess(int num);\
 */\
\
public class Solution extends GuessGame \{\
    public int guessNumber(int n) \{\
        int low=1, high=n;\
        while(low<=high)\
        \{\
            int mid=(high-low)/2+low, ans=guess(mid);\
            if(ans==0)\
                return mid;\
            else if(ans<0)\
                high=mid-1;\
            else\
                low=mid+1;\
        \}\
        return -1;\
        \
    \}\
\}}