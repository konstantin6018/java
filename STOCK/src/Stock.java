//����������� ��������� ���� Stock ����� ������� ���������� �� ������� � ������� - ���� � boolean ���� ���� � ������. 
//������������ ������� �� ����, ���������, �������, ������� � ������� � ���� �� 2 �������� ������, ����� �������������� ��������
public abstract class Stock {
protected float price;
protected boolean stock;
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public boolean isStock() {
	return stock;
}
public void setStock(boolean stock) {
	this.stock = stock;
}
public abstract void identify();
}
