{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class ParkingSystem \{\
    int numbig, nummed, numsma;\
    public ParkingSystem(int big, int medium, int small) \{\
        numbig=big;\
        nummed=medium;\
        numsma=small;\
    \}\
    \
    public boolean addCar(int carType) \{\
        if(carType==1 && numbig>0)\
        \{\
            numbig--;\
            return true;\
        \}\
        if(carType==2 && nummed>0)\
        \{\
            nummed--;\
            return true;\
        \}\
        if(carType==3 && numsma>0)\
        \{\
            numsma--;\
            return true;\
        \}\
        return false;\
    \}\
\}\
\
/**\
 * Your ParkingSystem object will be instantiated and called as such:\
 * ParkingSystem obj = new ParkingSystem(big, medium, small);\
 * boolean param_1 = obj.addCar(carType);\
 */}