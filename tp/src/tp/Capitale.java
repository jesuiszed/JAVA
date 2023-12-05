package tp;

import java.util.Objects;

public class Capitale extends Ville   {
	private String pays;
	public Capitale(String nom, String nomPresident, String pays) {
		super(nom, nomPresident);
		this.pays = pays;
	}
	@Override
	public String toString() {
		return "Capitale [pays=" + pays+ "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capitale other = (Capitale) obj;
		return pays == other.pays&& Objects.equals(pays, other.pays);
	}
	public int compareTo(Capitale v) {
		// TODO Auto-generated method stub
		return this.pays.compareTo(v.pays);
	}

	
	

}
