package com.virtusa.vravenew;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class RaveBadgesFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
		View view;
		view = inflater.inflate(R.layout.rave_badges_fragment_layout, container,false);
		
		
		ImageView badge1 = (ImageView) view.findViewById(R.id.badge1);
		ImageView badge2 = (ImageView) view.findViewById(R.id.badge2);
		ImageView badge3 = (ImageView) view.findViewById(R.id.badge3);
		ImageView badge4 = (ImageView) view.findViewById(R.id.badge4);
		ImageView badge5 = (ImageView) view.findViewById(R.id.badge5);
		ImageView badge6 = (ImageView) view.findViewById(R.id.badge6);
		ImageView badge7 = (ImageView) view.findViewById(R.id.badge7);
		ImageView badge8 = (ImageView) view.findViewById(R.id.badge8);
		ImageView badge9 = (ImageView) view.findViewById(R.id.badge9);
		ImageView badge10 = (ImageView) view.findViewById(R.id.badge10);
		
		
		badge1.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent badgeDetail = new Intent(getActivity(),BadgeDetail.class);
				badgeDetail.putExtra("BagdeName", "Avenger");
				badgeDetail.putExtra("Description","You received this badge after receiving 15 raves :D");
				startActivity(badgeDetail);
				return false;
			}
		});
		

		badge2.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent badgeDetail = new Intent(getActivity(),BadgeDetail.class);
				badgeDetail.putExtra("BagdeName", "Engizer");
				badgeDetail.putExtra("Description","You received this badge after receiving 15 raves :D");
				startActivity(badgeDetail);
				return false;
			}
		});
		
		badge3.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent badgeDetail = new Intent(getActivity(),BadgeDetail.class);
				badgeDetail.putExtra("BagdeName", "Hulk");
				badgeDetail.putExtra("Description","You received this badge after receiving 15 raves :D");
				startActivity(badgeDetail);
				return false;
			}
		});
		badge4.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent badgeDetail = new Intent(getActivity(),BadgeDetail.class);
				badgeDetail.putExtra("BagdeName", "Rave");
				badgeDetail.putExtra("Description","You received this badge after receiving 15 raves :D");
				startActivity(badgeDetail);
				return false;
			}
		});
		badge5.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent badgeDetail = new Intent(getActivity(),BadgeDetail.class);
				badgeDetail.putExtra("BagdeName", "Rockstar");
				badgeDetail.putExtra("Description","You received this badge after receiving 15 raves :D");
				startActivity(badgeDetail);
				return false;
			}
		});
		badge6.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent badgeDetail = new Intent(getActivity(),BadgeDetail.class);
				badgeDetail.putExtra("BagdeName", "VIP");
				badgeDetail.putExtra("Description","You received this badge after receiving 15 raves :D");
				startActivity(badgeDetail);
				return false;
			}
		});
		badge7.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent badgeDetail = new Intent(getActivity(),BadgeDetail.class);
				badgeDetail.putExtra("BagdeName", "Wizard of Bugs");
				badgeDetail.putExtra("Description","You received this badge after receiving 15 raves :D");
				startActivity(badgeDetail);
				return false;
			}
		});
		badge8.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent badgeDetail = new Intent(getActivity(),BadgeDetail.class);
				badgeDetail.putExtra("BagdeName", "Einstien");
				badgeDetail.putExtra("Description","You received this badge after receiving 15 raves :D");
				startActivity(badgeDetail);
				return false;
			}
		});
		badge9.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent badgeDetail = new Intent(getActivity(),BadgeDetail.class);
				badgeDetail.putExtra("BagdeName", "Coach");
				badgeDetail.putExtra("Description","You received this badge after receiving 15 raves :D");
				startActivity(badgeDetail);
				return false;
			}
		});
		badge10.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent badgeDetail = new Intent(getActivity(),BadgeDetail.class);
				badgeDetail.putExtra("BagdeName", "Code Ninja");
				badgeDetail.putExtra("Description","You received this badge after receiving 15 raves :D");
				startActivity(badgeDetail);
				return false;
			}
		});
		
		
		return view;
	}
	

	
//	public void alert(String title, String msg){
//		
//		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
//				getActivity());
// 
//			// set title
//			alertDialogBuilder.setTitle(title);
// 
//			// set dialog message
//			alertDialogBuilder
//				.setMessage(msg);
//			// create alert dialog
//			AlertDialog alertDialog = alertDialogBuilder.create();
//
//			// show it
//			alertDialog.show();
//		
//	}
//    private PopupWindow pwindo;
//    //person name
//    public void initiatePopupWindow(String msg) {
//
//            try {
//                     //layout_MainMenu.getForeground().setAlpha(50);
//            
//                    // We need to get the instance of the LayoutInflater
//                    LayoutInflater inflater = (LayoutInflater) getActivity()
//                                    .getSystemService(getActivity().LAYOUT_INFLATER_SERVICE);
//                    View layout = inflater.inflate(R.layout.popup_screen, (ViewGroup)
//
//                    getActivity().findViewById(R.id.popup));
//                    
//    
//                    
//                    pwindo = new PopupWindow(layout,ViewGroup.LayoutParams.MATCH_PARENT,
//                                    ViewGroup.LayoutParams.MATCH_PARENT, true);
//                    pwindo.showAtLocation(layout, Gravity.CENTER_VERTICAL, 10, 10);
//                    
//                    
//                    
//                    //ravetype
//                    TextView rave_type = (TextView) layout.findViewById(R.id.badgedetails);
//                    rave_type.setText(msg);
//                    
//                    LinearLayout l = (LinearLayout) layout.findViewById(R.id.outer_layout);
//                    l.setOnClickListener(new OnClickListener() {
//                                    
//                                    @Override
//                                    public void onClick(View v) {
//                                            pwindo.dismiss();
//                                            
//                                    }
//                            });
//                    LinearLayout l1 = (LinearLayout) layout.findViewById(R.id.popup);
//                    l1.setOnClickListener(new OnClickListener() {
//                            
//                            @Override
//                            public void onClick(View v) {
//                                    
//                            }
//                    });
//
//                  
//
//            } catch (Exception e) {
//                    e.printStackTrace();
//            }
//    }

}
