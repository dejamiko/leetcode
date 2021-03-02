{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /**\
 * Definition for a binary tree node.\
 * public class TreeNode \{\
 *     int val;\
 *     TreeNode left;\
 *     TreeNode right;\
 *     TreeNode(int x) \{ val = x; \}\
 * \}\
 */\
\
class Solution \{\
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) \{\
        if(original==null)\
            return null;\
        if(original.val==target.val)\
            return cloned;\
        TreeNode ans=getTargetCopy(original.left, cloned.left, target);\
        if(ans!=null)\
            return ans;\
        return getTargetCopy(original.right, cloned.right, target);\
    \}\
\}}