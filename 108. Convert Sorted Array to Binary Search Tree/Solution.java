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
    public TreeNode sortedArrayToBST(int[] nums) \{\
        return helper(nums, 0, nums.length-1);\
    \}\
    \
    public TreeNode helper(int[] nums, int l, int r) \{\
        if(l<0 || r<0 || l>r || l>nums.length || r>nums.length)\
            return null;\
        int m=(l+r)/2;\
        TreeNode root=new TreeNode(nums[m]);\
        root.left=helper(nums, l, m-1);\
        root.right=helper(nums, m+1, r);\
        return root;\
    \}\
\}}