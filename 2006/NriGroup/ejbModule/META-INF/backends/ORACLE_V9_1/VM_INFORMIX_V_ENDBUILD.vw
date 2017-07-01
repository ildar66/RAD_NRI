<?xml version="1.0"?>

<View name="V_ENDBUILD">
<Database>ejbModule/META-INF/backends/ORACLE_V9_1/VM.dbxmi</Database>
<Schema>ejbModule/META-INF/backends/ORACLE_V9_1/VM_INFORMIX.schxmi</Schema>
<StatementType>SelectStatement</StatementType>

<![CDATA[


-- Generated by Relational Schema Center on Fri May 23 16:08:46 MSD 2008 for Oracle9i


CREATE VIEW INFORMIX.V_ENDBUILD
  (STORAGEPLACE,
   REGIONID,
   DATE_ENDBUILD)
  AS SELECT 
   x0.STORAGEPLACE, 
   x0.REGIONID, 
   x0.DATE_ENDBUILD
FROM
   INFORMIX.POSITIONS x0
WHERE
   x0.DATE_ENDBUILD IS NOT NULL  ;
]]>
</View>
