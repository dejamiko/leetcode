{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Cashier \{\
    int limit;\
    int current;\
    int discount;\
    int[] products;\
    int[] prices;\
    public Cashier(int n, int discount, int[] products, int[] prices) \{\
        limit=n;\
        current=0;\
        this.discount=discount;\
        this.products=products;\
        this.prices=prices;\
    \}\
    \
    public double getBill(int[] product, int[] amount) \{\
        double bill=0;\
        for(int i=0; i<product.length; ++i)\
            for(int j=0; j<products.length; ++j)\
                if(product[i]==products[j])\
                \{\
                    bill+=amount[i]*prices[j];\
                    break;\
                \}\
        current=++current%limit;\
        if(current==0)\
            bill=bill-(discount*bill)/100;\
        return bill;\
    \}\
\}\
\
/**\
 * Your Cashier object will be instantiated and called as such:\
 * Cashier obj = new Cashier(n, discount, products, prices);\
 * double param_1 = obj.getBill(product,amount);\
 */}