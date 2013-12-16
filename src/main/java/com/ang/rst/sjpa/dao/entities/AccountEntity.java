package com.ang.rst.sjpa.dao.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "NP_ACCOUNT")
public class AccountEntity  implements Serializable {
	
	 private static final long serialVersionUID = -8056138866282113293L;

	    @Id
	    @Column(name = "ID")
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    
	    
	    @Basic
	    @Column(name = "UUID", length = 256, nullable = false)
	    private String uuid;
	    
	    @Basic
	    @Column(name = "ACCT_ID")
	    private String acctId;
		
	    @Basic
	    @Column(name = "ACCT_NAME")
		private String acctname;
		
	    @Basic
	    @Column(name = "ORG_NAME")
		private String institutionName;
		
	    @Basic
	    @Column(name = "ACCT_TYPE")
		private String acctType;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUuid() {
			return uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getAcctId() {
			return acctId;
		}

		public void setAcctId(String acctId) {
			this.acctId = acctId;
		}

		public String getAcctname() {
			return acctname;
		}

		public void setAcctname(String acctname) {
			this.acctname = acctname;
		}

		public String getInstitutionName() {
			return institutionName;
		}

		public void setInstitutionName(String institutionName) {
			this.institutionName = institutionName;
		}

		public String getAcctType() {
			return acctType;
		}

		public void setAcctType(String acctType) {
			this.acctType = acctType;
		}
	    
	    

}
