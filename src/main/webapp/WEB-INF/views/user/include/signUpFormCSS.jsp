<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/tailwindcss">
  main {@apply text-gray-600 container px-5 py-16 mx-auto}
  article {@apply lg:w-2/3 w-full mx-auto overflow-auto}
  form {@apply flex flex-col max-w-2xl mx-auto pb-2 gap-3 xl:gap-6 before:text-lg before:xl:text-2xl before:font-bold before:text-gray-600 before:text-center}
  form > label {@apply flex flex-col w-full text-sm sm:text-base}
  form > label > font {@apply before:font-medium before:text-gray-600 before:mr-4}
  form > button[type=submit] {@apply relative flex justify-center rounded-md border border-transparent bg-slate-600 py-2 px-4 mt-4 text-sm font-medium text-white
  hover:bg-slate-700 focus:outline-none focus:ring-2 focus:ring-slate-500 focus:ring-offset-2}
  form input {@apply mt-1 w-full px-3 py-2 bg-white border border-violet-300 rounded-md text-sm shadow-sm placeholder-slate-400
  focus:outline-none focus:border-violet-500 focus:ring-1 focus:ring-violet-500 disabled:bg-slate-50 disabled:text-slate-500
  disabled:border-slate-200 disabled:shadow-none}
</style>