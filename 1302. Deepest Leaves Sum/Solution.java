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
 *     TreeNode() \{\}\
 *     TreeNode(int val) \{ this.val = val; \}\
 *     TreeNode(int val, TreeNode left, TreeNode right) \{\
 *         this.val = val;\
 *         this.left = left;\
 *         this.right = right;\
 *     \}\
 * \}\
 */\
class Solution \{\
    public int deepestLeavesSum(TreeNode root) \{\
        int[] ans=new int[2];\
        search(root, 0, ans);\
        return ans[1];\
    \}\
    public void search(TreeNode node, int level, int[] ans)\{\
        if(node==null)\
            return;\
        search(node.left, level+1, ans);\
        search(node.right, level+1, ans);\
        if(level>ans[0])\
        \{\
            ans[0]=level;\
            ans[1]=node.val;\
        \}\
        else if(ans[0]==level)\
            ans[1]+=node.val;\
    \}\
\}}