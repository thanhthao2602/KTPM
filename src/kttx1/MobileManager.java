/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kttx1;

/**
 *
 * @author 84363
 */
import java.util.List;
public interface MobileManager {
    public boolean addMobile(Mobile m);

	public boolean editMobile(Mobile m);

	public boolean delMobile(Mobile m);

	public List<Mobile> searchMobile(String name);

	public List<Mobile> sortedMobile(double price);
}
